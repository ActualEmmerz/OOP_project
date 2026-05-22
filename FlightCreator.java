public class FlightCreator extends TransportationCreator {

    @Override
    public TransportationStrategy createTransportation() {
        return new FlightStrategy();
    }
}