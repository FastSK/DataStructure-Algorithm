package Sort;

import java.util.Arrays;

/**
 * Merge Sort
 * : Recursively divides the array into halves until reaching the base case of array with 1 element.
 * Then, the merge function picks up the sorted sub-arrays and merges them
 * to gradually sort the entire array
 *
 * Merge() Function
 * Step 1. Create duplicate copies of sub-arrays to be sorted
 * Step 2. Maintain current index of sub-arrays and main array
 * Step 3. Until reaching the end of either sub1 or sub2, pick larger among elements sub1 and sub2
 * and place them in the correct position at A[p..r]
 * Step 4. When we run out of elements in either sub1 or sub2, pick up the remaining elements
 * and put it in A[p..r]
 */


public class MergeSort {
    // Merge two sub arrays L and M into arr
    void merge(int[] arr, int p, int q, int r) {

        // 1. Create sub arrays 1 : A[p..q] and 2: A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] sub1 = new int[n1];
        int[] sub2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            sub1[i] = arr[p + i];
            for (int j = 0; j < n2; j++) {
                sub2[j] = arr[q + 1 + j];
            }
        }

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either sub1 or sub2, pick larger among
        // elements sub1 and sub2 and place them in the correct position as A[p..r]
        while (i < n1 && j < n2) {
            if (sub1[i] <= sub2[j]) {
                arr[k] = sub1[i];
                i++;
            } else {
                arr[k] = sub2[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either sub1 or sub2,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = sub1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = sub2[j];
            j++;
            k++;
        }
    }

    // Divide the array into two sub arrays, sort them and merge them
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // m is the point where the array is divided into two sub arrays
            int m = (l + r) / 2;

            mergeSort(arr, l, m );
            mergeSort(arr, m+1, r);

            // Merge the sorted sub arrays
            merge(arr, l, m, r);
        }
    }

    // Driver program
    public static void main(String[] args) {
        int[] arr = { 6, -1, 12, 10, 9, 1 };

        MergeSort ms = new MergeSort();
        ms.mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array : " + Arrays.toString(arr));
    }

}
