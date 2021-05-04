import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passenger;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passenger = new ArrayList<Person>();
    }

    public int getPassengers(){
        return passenger.size();
    }

    public void addPassenger(BusStop busStop){
        if (capacity > passenger.size() && busStop.getQueueLength() > 0){
            Person person = busStop.removePersonFromQueue();
            passenger.add(person);
        }
    }

    public void removePassenger(){
        passenger.remove(0);
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }
}
