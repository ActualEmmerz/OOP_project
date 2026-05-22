public class TrainCreator extends TransportationCreator {

    @Override
    public TransportationStrategy createTransportation() {
        return new TrainStrategy();
    }
}