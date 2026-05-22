import java.util.ArrayList;

public class TravelEventManager {

    private ArrayList<TravelObserver> observers;

    public TravelEventManager() {
        observers = new ArrayList<>();
    }

    public void addObserver(TravelObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {

        for (TravelObserver observer : observers) {
            observer.update(message);
        }
    }
}