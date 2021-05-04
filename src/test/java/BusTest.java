import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private BusStop busStop;
    private Person person;

    @Before
    public void setUp(){
        bus = new Bus("Your Ma's house", 10);
        busStop = new BusStop("Outside Your Ma's House");
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
    }

    @Test
    public void hasDestination(){
        assertEquals("Your Ma's house", bus.getDestination());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, bus.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(2, bus.getPassengers());
    }

    @Test
    public void cannotAddAtCapacity(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        assertEquals(10, bus.getPassengers());
        bus.addPassenger(busStop);
        assertEquals(10, bus.getPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(busStop);
        bus.addPassenger(busStop);
        bus.removePassenger();
        assertEquals(1, bus.getPassengers());

    }
}
