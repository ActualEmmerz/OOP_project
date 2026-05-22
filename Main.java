public class Main {

    public static void main(String[] args) {

        // Builder Pattern
        TravelRoute route = new TravelRoute.Builder()
                .addStop(new Location("Chicago"))
                .addStop(new Location("London"))
                .addStop(new Location("Paris"))
                .addStop(new Location("Dubai"))
                .build();

        System.out.println("Travel Route:");
        route.printRoute();

        System.out.println();

        // Factory Method Pattern
        TransportationCreator flightCreator =
                new FlightCreator();

        TransportationCreator trainCreator =
                new TrainCreator();

        TransportationStrategy flight =
                flightCreator.createTransportation();

        TransportationStrategy train =
                trainCreator.createTransportation();

        // Decorator Pattern
        TransportationStrategy delayedFlight =
                new DelayDecorator(flight);

        // Observer Pattern
        Passenger passenger =
                new Passenger("Sorin");

        TravelEventManager manager =
                new TravelEventManager();

        manager.addObserver(passenger);

        // Singleton Pattern
        TravelSimulationEngine engine =
                TravelSimulationEngine.getInstance();

        engine.runSimulation(
                route,
                delayedFlight,
                manager
        );

        System.out.println();

        engine.runSimulation(
                route,
                train,
                manager
        );
    }
}