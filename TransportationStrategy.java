public interface TransportationStrategy {
    void travel(Location from, Location to);

    String getTransportationType();
}
