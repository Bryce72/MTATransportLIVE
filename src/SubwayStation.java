import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class SubwayStation {
    //This class will take in the station ID and map it to the known station name & direction

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






}
