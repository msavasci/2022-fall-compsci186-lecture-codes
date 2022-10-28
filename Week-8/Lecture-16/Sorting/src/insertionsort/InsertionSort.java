package insertionsort;

public class InsertionSort {
    public static int numberOfComparisons = 0;
    public static int numberOfSwaps = 0;

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void insertIntoSorted(int[] array, int sortedBoundary) {
        for (int i = sortedBoundary; i > 0; i--) {
            numberOfComparisons++;
            if (array[i] < array[i-1]) {
                swap(array, i, i-1);
                numberOfSwaps++;
            } else {
                break;
            }
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            insertIntoSorted(array, i);
        }

        return array;
    }



    

}