import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BusTest {
    Bus bus;

    @Before
    public void before(){
        bus = new Bus("Springburn", 2);
    }

    @Test
    public void hasDestination(){
        assertEquals("Springburn", bus.getDestination());
    }

    @Test
    public void hasMaxCapacity(){
        assertEquals(2, bus.getCapacity());

    }

    @Test
    public void hasNoPassengers(){
        assertEquals(0, bus.checkPassengers());
    }

    @Test
    public void canAddPassengers() {
        Person passenger = new Person();
        bus.addPassenger(passenger);
        assertEquals(1, bus.checkPassengers());
    }

    @Test
    public void capacityReached() {
        Person passenger = new Person();
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        bus.addPassenger(passenger);
        assertFalse(bus.checkSeatsAvailable());
    }

    @Test
    public void canRemovePassenger() {
        Person passenger = new Person();
        bus.addPassenger(passenger);
        Person removedPassenger = bus.removePassenger();
        assertEquals(0, bus.checkPassengers());
        assertEquals(removedPassenger, passenger);
    }
}
