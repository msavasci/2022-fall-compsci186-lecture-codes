package delivery;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DeliverySimulator {
    public static Map<Location, Integer> locationsVisited(String directions) {
        Map<Location, Integer> locationCount = new HashMap<>();
        
        int x = 0, y = 0;

        locationCount.put(new Location(0, 0), 1);

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

            Location current = new Location(x, y);
            
            int t = locationCount.getOrDefault(current, 0);
            t++;
            locationCount.put(current, t);
        }

        return locationCount;
    }

    public static int housesVisited(Map<Location, Integer> loc) {
        return loc.size();
    }

    public static Set<Location> locationsVisited(Map<Location, Integer> loc) {
        return loc.keySet();
    }

    public static int numberOfFoodItems(Map<Location, Integer> loc, Location l) {
        return loc.getOrDefault(l, 0);
    }
}