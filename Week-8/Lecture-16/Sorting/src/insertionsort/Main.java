package insertionsort;

public class Main {
    public static void main(String[] args) throws Exception {
        // int[] myArray = new int[]{5, 3, 6, 7, 1, 10, 3};
        // int[] myArray = new int[]{1, 3, 4, 5, 6, 7, 10};
        int[] myArray = new int[]{10, 7, 6, 5, 4, 3, 1};
        int[] sortedArray = InsertionSort.sort(myArray);

        for (int el: sortedArray) {
            System.out.print(el + " ");
        }

        System.out.println("\nNumber of comparisons: " + InsertionSort.numberOfComparisons);
        System.out.println("Number of swaps: " + InsertionSort.numberOfSwaps);
    }
}