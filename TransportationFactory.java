public class TransportationFactory {

    public static TransportationStrategy createTransportation(String type) {

        if (type.equalsIgnoreCase("flight")) {
            return new FlightStrategy();
        }

        if (type.equalsIgnoreCase("train")) {
            return new TrainStrategy();
        }

        throw new IllegalArgumentException("Invalid transportation type.");
    }
}
