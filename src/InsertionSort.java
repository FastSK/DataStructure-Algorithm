/**
 * Insertion Sort
 * : Sorts an array of items by repeatedly taking an element from the unsorted portion
 * of the array and inserting it into its correct position in the sorted portion
 * of the array.
 *
 * 1. The procedure takes a single argument, ‘A’, which is a list of sortable items.
 * 2. The variable ‘n’ is assigned the length of the array A.
 * 3. The outer for loop starts at index ‘1’ and runs for ‘n-1’ iterations, where ‘n’ is the length of the array.
 * 4. The inner while loop starts at the current index i of the outer for loop and compares each element to its left neighbor. If an element is smaller than its left neighbor, the elements are swapped.
 * 5. The inner while loop continues to move an element to the left as long as it is smaller than the element to its left.
 * 6. Once the inner while loop is finished, the element at the current index is in its correct position in the sorted portion of the array.
 * 7. The outer for loop continues iterating through the array until all elements are in their correct positions and the array is fully sorted.
 */
import java.util.Arrays;

public class InsertionSort {
    void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // compare key with each element on the left of it
            // until an element smaller than it is found.
            // for descending order, change key < array[j] to key > array[j]
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place key at after the element just smaller than it
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
       int[] arr = {10, 2, 4, 9, 13};

       InsertionSort is = new InsertionSort();
       is.sort(arr);
       System.out.println(Arrays.toString(arr));
    }
}
