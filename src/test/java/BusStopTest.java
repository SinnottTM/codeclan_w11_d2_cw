import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void setUp() {
        busStop = new BusStop("Outside Your Ma's House");
    }

    @Test
    public void hasName() {
        assertEquals("Outside Your Ma's House", busStop.getName());
    }

    @Test
    public void hasQueueLength() {
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonToQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.getQueueLength());
    }
}
