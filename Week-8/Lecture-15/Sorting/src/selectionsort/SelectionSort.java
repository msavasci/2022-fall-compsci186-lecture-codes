package selectionsort;

public class SelectionSort {
    public static int minIndex(int[] array, int index) {
        int minIndex = index;

        for (int i = minIndex + 1; i < array.length; i++) {
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
        for (int i = 0; i < array.length; i++) {
            if (i != minIndex(array, i)) {
                swap(array, i, minIndex(array, i));
            }
        }

        return array;
    }
}