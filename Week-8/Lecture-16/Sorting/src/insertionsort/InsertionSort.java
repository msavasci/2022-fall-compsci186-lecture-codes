package insertionsort;

public class InsertionSort {
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void insertInSorted(int[] array, int sortedBoundary) {
        for (int i = sortedBoundary; i > 0; i--) {
            if (array[i] < array[i-1]) {
                swap(array, i, i-1);
            }
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            insertInSorted(array, i);
        }

        return array;
    }



    

}