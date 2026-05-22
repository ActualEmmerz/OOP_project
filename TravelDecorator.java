public abstract class TravelDecorator implements TransportationStrategy {

    protected TransportationStrategy decoratedTransportation;

    public TravelDecorator(
            TransportationStrategy decoratedTransportation
    ) {

        this.decoratedTransportation =
                decoratedTransportation;
    }

    @Override
    public void travel(Location from, Location to) {

        decoratedTransportation.travel(from, to);
    }

    @Override
    public String getTransportationType() {

        return decoratedTransportation
                .getTransportationType();
    }
}