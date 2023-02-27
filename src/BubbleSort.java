import java.util.Arrays;

/**
 * Bubble Sort
 * 1. Iteration : Compare and Swap
 *  1) compare 1st and 2nd elements
 *  2) if 1st is greater than 2nd element, swap those two.
 *  3) compare 2nd and 3rd element.
 *  4) keep this process until the last element.
 *
 * 2. Remaining Iteration until all the unsorted elements are placed
 * at their correct positions.
 *
 *
 */

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int size = arr.length;

        // loop to access each element in array
        for (int i=0; i < size-1; i++) {

            // check if swapping occurs
            boolean swapped = false;

            // inner loop
            // compare adjacent elements
            for (int j = 0; j < size -i-1; j++) {

                // compare two adjacent elements
                if (arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            // No swapped = given array is already sorted
            // so, no need for further comparison
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 8, 3, 88, 10, 2};
        BubbleSort.bubbleSort(data);

        System.out.print("Sorted Array : " + Arrays.toString(data));
    }
}
