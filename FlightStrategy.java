public class FlightStrategy implements TransportationStrategy {

    @Override
    public void travel(Location from, Location to) {
        System.out.println(
                "Flying from " + from.getName() +
                " to " + to.getName()
        );
    }

    @Override
    public String getTransportationType() {
        return "Flight";
    }
}
