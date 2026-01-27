
import com.google.transit.realtime.GtfsRealtime;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public class TerminalEntry {

    public static void main(String[] args) throws IOException {
            SubwayStation test = new SubwayStation("101");


            DataController testing =  new DataController('E', "North");
//            System.out.println(testing.getFeedList().size());
                System.out.println(testing.getExpectedTimeArrival());
            }

//        URL url = new URL(MtaAPIConfig.getFeedUrlForLine('C'));
//        GtfsRealtime.FeedMessage feed = GtfsRealtime.FeedMessage.parseFrom(url.openStream());
//        for (GtfsRealtime.FeedEntity entity : feed.getEntityList()) {
//            if (entity.hasTripUpdate() ) {
////                  System.out.println(entity.getTripUpdate());
//                  if(entity.getTripUpdate().getStopTimeUpdateCount() > 0 && entity.getTripUpdate().getTrip().getRouteId().equals("E")){
//                      for (int i = 0; i < entity.getTripUpdate().getStopTimeUpdateCount(); i++){
////                          if(Objects.equals(entity.getTripUpdate().getStopTimeUpdate(i).getStopId(), "G08"))
//                            System.out.println(entity.getTripUpdate().getStopTimeUpdate(i));
//                      }
//
//
//                  }
////                System.out.println(entity.getTripUpdate());
////                System.out.println(entity.getTripUpdate().getTrip().getRouteId());
//            }
//        }



}
