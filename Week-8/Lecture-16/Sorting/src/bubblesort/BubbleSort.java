package bubblesort;

public class BubbleSort {
    public static int numberOfComparisons = 0;
    public static int numberOfSwaps = 0;

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    static void bubbleUp(int[] array, int stopIndex) {
        for (int i = 0; i < stopIndex; i++) {
            numberOfComparisons++;
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                numberOfSwaps++;
            }
        }
    }

    public static int[] sort(int[] array) {       
        int last = array.length - 1;
        
        for (int i = 0; i < array.length; i++) {
            bubbleUp(array, last);
            last--;
        }

        return array;
    }    
}