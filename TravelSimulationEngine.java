import java.util.ArrayList;

public class TravelSimulationEngine {

    // Singleton Pattern
    private static TravelSimulationEngine instance;

    private TravelSimulationEngine() {
    }

    public static TravelSimulationEngine getInstance() {

        if (instance == null) {
            instance = new TravelSimulationEngine();
        }

        return instance;
    }

    public void runSimulation(
            TravelRoute route,
            TransportationStrategy strategy,
            TravelEventManager manager
    ) {

        ArrayList<Location> stops = route.getStops();

        System.out.println(
                "Simulation using: " +
                strategy.getTransportationType()
        );

        for (int i = 0; i < stops.size() - 1; i++) {

            Location current = stops.get(i);
            Location next = stops.get(i + 1);

            strategy.travel(current, next);

            manager.notifyObservers(
                    "Arrived at " +
                    next.getName()
            );
        }
    }
}