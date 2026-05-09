import java.util.ArrayList;

public class TravelRoute {

    private ArrayList<Location> stops;

    private TravelRoute() {
        stops = new ArrayList<>();
    }

    public void addStop(Location location) {
        stops.add(location);
    }

    public ArrayList<Location> getStops() {
        return stops;
    }

    public void printRoute() {
        for (Location loc : stops) {
            System.out.println(loc.getName());
        }
    }

    // Builder Pattern
    public static class Builder {

        private TravelRoute route;

        public Builder() {
            route = new TravelRoute();
        }

        public Builder addStop(Location location) {
            route.addStop(location);
            return this;
        }

        public TravelRoute build() {
            return route;
        }
    }
}
