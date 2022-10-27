package bubblesort;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] myArray = new int[]{5, 3, 6, 7, 1, 10, 3};
        int[] sortedArray = BubbleSort.sort(myArray);

        for (int el: sortedArray) {
            System.out.print(el + " ");
        }
    }
}
