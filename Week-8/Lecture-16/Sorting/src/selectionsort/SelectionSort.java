package selectionsort;

public class SelectionSort {
    public static int numberOfComparisons = 0;
    public static int numberOfSwaps = 0;

    public static int indexOfMinumum(int[] array, int index) {
        int minIndex = index;

        for (int i = minIndex + 1; i < array.length; i++) {
            numberOfComparisons++;
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // if (i != indexOfMinumum(array, i)) {
            swap(array, i, indexOfMinumum(array, i));
            numberOfSwaps++;
            // }
        }

        return array;
    }
}