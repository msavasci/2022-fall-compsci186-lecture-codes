public class App {
    // Driver code
    public static void main(String args[])
    {
        int numberOfDiscs = 3;
        Hanoi hn = new Hanoi();
        // A, B and C are names of rods
        hn.towerOfHanoi(numberOfDiscs, 'A', 'B', 'C');
    }    
}
