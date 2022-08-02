import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int checkPassengers() {
        return passengers.size();
    }

    public void addPassenger(Person newPassenger) {
        if (checkSeatsAvailable() == true) {
            passengers.add(newPassenger);
        }
    }

    public boolean checkSeatsAvailable() {
        if (checkPassengers() < capacity) {
            return true;
        } else {
            return false;
        }
    }

    public Person removePassenger() {
        return passengers.remove(0);
    }
}
