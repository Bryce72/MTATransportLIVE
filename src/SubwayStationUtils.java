import java.util.List;

/*
 * Perhaps I find a better approach in the future - here holds the features each station object will have
 */
public interface SubwayStationUtils {

    String getId();
    String getStationName();
    String getLine();
    String getDirection();      // Uptown/Downtown - in docs represented as N/S - may need helper func for this
    double getLatitude();
    double getLongitude();
    List<String> getTransfers();
    boolean isAccessible();



}
