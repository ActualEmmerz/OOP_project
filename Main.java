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

        // Factory Pattern
        TransportationStrategy flight =
                TransportationFactory.createTransportation("flight");

        TransportationStrategy train =
                TransportationFactory.createTransportation("train");

        // Singleton Pattern
        TravelSimulationEngine engine =
                TravelSimulationEngine.getInstance();

        engine.runSimulation(route, flight);

        System.out.println();

        engine.runSimulation(route, train);
    }
}
