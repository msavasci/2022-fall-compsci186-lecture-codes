package delivery;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class LocationTest {
    @Test
    public void testLocationEquals() {
        Location x = new Location(0,0);
        Location y = x;
        Location z = new Location(0,0);
        assertTrue(x == y);
        assertFalse(x == z);

        assertEquals(x, y);
        assertEquals(x, z);
    }

    @Test
    public void testLocationNotEquals() {
        assertFalse(new Location(0,0).equals(new Location(0,1)));
    }

    @Test
    public void testEmptyDirections() {
        assertEquals(null, DeliverySimulator.locationsVisited(""));
    }

    @Test
    public void testSimple() {
        assertEquals(new HashMap<Location, Integer>() {{put(new Location(0, 0), 1); put(new Location(1, 0), 1);}}, DeliverySimulator.locationsVisited(">"));
    }

    @Test
    public void testFour() {
        assertEquals(new HashMap<Location, Integer>() {{put(new Location(0, 0), 2); put(new Location(0, 1), 1); put(new Location(1, 1), 1); put(new Location(1, 0), 1);}}, DeliverySimulator.locationsVisited("^>v<"));
    }
}