public class App {
    // Driver code
    public static void main(String args[])
    {
        Hanoi hn = new Hanoi(3);
        // A, B and C are names of rods
        hn.towerOfHanoi(hn.numberOfDiscs, 'A', 'B', 'C');
    }    
}
