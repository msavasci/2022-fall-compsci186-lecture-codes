package delivery;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

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
        assertEquals(new HashSet<Location>(Arrays.asList(new Location(0,0))), DeliverySimulator.locationsVisited(""));
    }

    @Test
    public void testSimple() {
        assertEquals(new HashSet<Location>(Arrays.asList(new Location(0, 0), new Location(1, 0))),
                DeliverySimulator.locationsVisited(">"));
    }

    @Test
    public void testFour() {
        assertEquals(
                new HashSet<Location>(
                        Arrays.asList(new Location(0, 0), new Location(0, 1), new Location(1, 1), new Location(1, 0))),
                DeliverySimulator.locationsVisited("^>v<"));
    }
}