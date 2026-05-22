public class DelayDecorator extends TravelDecorator {

    public DelayDecorator(
            TransportationStrategy decoratedTransportation
    ) {

        super(decoratedTransportation);
    }

    @Override
    public void travel(Location from, Location to) {

        super.travel(from, to);

        System.out.println(
                "Delay detected between " +
                from.getName() +
                " and " +
                to.getName()
        );
    }
}