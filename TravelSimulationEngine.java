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
            TransportationStrategy strategy
    ) {

        ArrayList<Location> stops = route.getStops();
