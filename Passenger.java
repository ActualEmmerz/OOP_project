public class Passenger implements TravelObserver {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventMessage) {

        System.out.println(
                "Passenger " +
                name +
                " received update: " +
                eventMessage
        );
    }
}