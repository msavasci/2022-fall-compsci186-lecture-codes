package delivery;

import java.util.HashSet;
import java.util.Set;

public class DeliverySimulator {
    public static Set<Location> locationsVisited(String directions) {
        Set<Location> visited = new HashSet<>();
        visited.add(new Location(0, 0));

        int x = 0;
        int y = 0;

        for (int i = 0; i < directions.length(); i++) {
            final char d = directions.charAt(i);
            if (d == '>') {
                x += 1;
            } else if (d == '<') {
                x -= 1;
            } else if (d == '^') {
                y += 1;
            } else if (d == 'v') {
                y -= 1;
            }
            visited.add(new Location(x, y));
        }

        return visited;
    }

    public static int housesVisited(Set<Location> visited) {
        return visited.size();
    }
}
