public class Main {
    public static void main(String[] args) {
        TravelRoute route = new TravelRoute();
        //test locations
        route.addStop(new Location("Chicago"));
        route.addStop(new Location("London"));
        route.addStop(new Location("Paris"));
    }
}
