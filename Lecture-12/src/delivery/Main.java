package delivery;

public class Main {
    public static void main(String[] args) {
        Location x = new Location(0, 0);
        System.out.println(x);
        Location y = new Location(0, 0);

        System.out.println(x == y);

        System.out.println(x.equals(y));
        System.out.println(x.equals(new Location(1, 0)));
    }
}
