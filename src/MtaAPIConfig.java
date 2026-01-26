import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class MtaAPIConfig {
    // API keys here are public and free found here: https://api.mta.info/#/subwayRealTimeFeeds

    //TODO: add LIRR api

    private static  final Map<String, Set<Character>> apiMap = Map.ofEntries(
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-ace", Set.of('A', 'C', 'E')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-g", Set.of('G')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-bdfm", Set.of('B', 'D', 'F', 'M')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-jz", Set.of('J', 'Z')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-nqrw", Set.of('N', 'Q', 'R', 'W')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs-l", Set.of('L')),
            entry("https://api-endpoint.mta.info/Dataservice/mtagtfsfeeds/nyct%2Fgtfs", Set.of('1', '2', '3', '4', '5', '6', '7', 'S'))

    );



    public static String getFeedUrlForLine(char line)
    {
        for (Map.Entry<String, Set<Character>> entry : apiMap.entrySet()){
            if(entry.getValue().contains(line)){
                return entry.getKey();
            }
        }
        return "";// need to return uppercase line api based on static map
    }
}
