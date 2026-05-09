public class TrainStrategy implements TransportationStrategy {

    @Override
    public void travel(Location from, Location to) {
        System.out.println(
                "Taking a train from " + from.getName() +
                " to " + to.getName()
        );
    }

    @Override
    public String getTransportationType() {
        return "Train";
    }
}
