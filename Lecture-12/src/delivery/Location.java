package delivery;

import java.util.Objects;

public class Location {
    public final int x;
    public final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (!(o instanceof Location))
            return false;
        Location l = (Location) o;
        if (x == l.x && y == l.y)
            return true;
        return false;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}