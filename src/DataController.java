import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.transit.realtime.GtfsRealtime;


public class DataController {
    // This class will communicate with MTA's API
    private char mtaLine;
    private String direction;
    private String feedUrl;



    public DataController(char mtaLine, String direction) throws IOException {
        this.direction = direction;
        updateRoute(mtaLine);

    }


    // this sets the MTA line attribute and feedurl attribute. Just makes it easy
    public void updateRoute(char mtaLine) {
        char temp = Character.toUpperCase(mtaLine);
        String currentSubwayLines = "ACEBDFMGNQRWL1234567S";

        //check if mtaLine char is an actual line
        if(currentSubwayLines.indexOf(temp) == -1){
            throw new IllegalArgumentException("Not a valid MTA line: " +mtaLine);
        }

        this.mtaLine = temp;
        this.feedUrl = MtaAPIConfig.getFeedUrlForLine(temp);
    }



    public String getExpectedTimeArrival() throws IOException {
        List<GtfsRealtime.TripUpdate> tripUpdates = getFeedList();
        for (int i = 0; i <  tripUpdates.size(); i++){
            System.out.println(tripUpdates);
        }
        return "";
    }


    // store data in list that I need - just didnt feel like popping up this for loop so often
    // returns a list of valid get tripupdates entities.
    public List<GtfsRealtime.TripUpdate> getFeedList() throws IOException {
        URL url = new URL(this.feedUrl);
        GtfsRealtime.FeedMessage feed = GtfsRealtime.FeedMessage.parseFrom(url.openStream());
        List<GtfsRealtime.TripUpdate> validFeed = new ArrayList<>();
        for (GtfsRealtime.FeedEntity entity : feed.getEntityList()) {
            if (entity.hasTripUpdate() ) {
//                  System.out.println(entity.getTripUpdate());
                  validFeed.add(entity.getTripUpdate());

            }
        }
        return validFeed;
    }




}
