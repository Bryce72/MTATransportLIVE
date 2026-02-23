import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class SubwayStation implements SubwayStationUtils{
    //This class will take in the station ID and map it to the known station name & direction


    // TODO: create a function to load the station data once and apply it to the contstuctor
    //   -- my idea here is to have this be the base class that will give birth to all the other station objects i want
    //   -- i realize this is an idiotic approach due to how mant station there are but i only care about the ones i wana see on my led
    //   -- obj should look like : SubwayStation forestHills = new SubwayStation("F11");


    private String id;

    public SubwayStation(String id){
        this.id = id;
    }


    public String getSubwayName(){
        // look through that text file and return name matching id
        try(BufferedReader file = new BufferedReader(new FileReader("lookupfiles/stops.txt"))){
            file.readLine(); //skips header
            String line;
            while((line = file.readLine()) != null){
                if(line.substring(0, 3).equals(id)){
                    return line.split(",")[1].trim();
                }
            }
        }
        catch (IOException e){
            System.out.println("Error with file reading../");
        }
        return "";
    }


    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getStationName() {
        return "";
    }

    @Override
    public String getLine() {
        return "";
    }

    @Override
    public String getDirection() {
        return "";
    }

    @Override
    public double getLatitude() {
        return 0;
    }

    @Override
    public double getLongitude() {
        return 0;
    }

    @Override
    public List<String> getTransfers() {
        return List.of();
    }

    @Override
    public boolean isAccessible() {
        return false;
    }
}
