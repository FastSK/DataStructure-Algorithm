package Sort;

import java.util.Arrays;

/**
 * Selection Sort
 * : select the smallest element from an unsorted list in each iteration
 * and places that element at the beginning of the unsorted list\
 * 1. Select first element as minimum
 * 2. Compare minimum with the remaining elements
 * 3. Swap the first with minimum
 * 4. Iteration
 */


public class SelectionSort {
    void sort(int[] arr) {
        int n = arr.length;

        // one by one move boundary of unsorted sub array
        for (int i = 0; i < n-1; i++) {
            // find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    // assign next element as min_idx
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            // Swap the i'th element with min_index element.
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 4, 9, 13};

        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
