import java.util.ArrayList;

public class TravelRoute {
    private ArrayList<Location> stops = new ArrayList<>();

    public void addStop(Location location) {
        stops.add(location);
    }

    public ArrayList<Location> getStops() {
        return stops;
    }

    public void printRoute() {
        for (Location loc: stops) {
            System.out.println(loc.getName());
        }
    }
}
