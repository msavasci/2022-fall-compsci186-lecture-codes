package delivery;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Location, Integer> lc = DeliverySimulator.locationsVisited("^>v<");
        System.out.println(lc);
        System.out.println(DeliverySimulator.housesVisited(lc));
        System.out.println(DeliverySimulator.locationsVisited(lc));
        System.out.println(DeliverySimulator.numberOfFoodItems(lc, new Location(0, 0)));
    }
}
