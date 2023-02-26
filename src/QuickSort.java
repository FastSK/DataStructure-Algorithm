/**
 * QuickSort
 * Divide and Conquer Algorithm
 * Partition Algorithm
 * 1. Array is divided into sub arrays by selecting a pivot element
 * 2. The Left and Right sub-arrays are also divided using the same approach.
 * This process continues until each sub-array contains a single element.
 * 3. At this point, elements are already sorted. Finally, elements are combined
 * to form a sorted array
 */

import java.util.Arrays;

/**
 * Algorithm
 * 1. select a pivot element
 * 2. Rearrange the Array (left - pivot element - right)
 * - Put all the smaller elements on the left and greater on the right of
 * pivot elements
 *  2-1) Comparison of pivot element with element beginning from the first index
 *  2-2) If the element is greater than the pivot element, 2nd point is set for that element
 *  2-3) Pivot is compared with other elements
 *  2-4) The process is repeated to set the next greater element as the second pointer
 *  2-5) The process goes on until the second last element is reached
 *  2-6) Finally, the pivot element is swapped with the second pointer
 * 3. Divide Sub arrays
 * - Select pivot element of in each half and put at correct place using recursion
 *
 */

public class QuickSort {
    // method to find the partition position
    static int partition(int array[], int low, int high) {
        // choose the right most element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = low - 1;

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {  // ascending order
                // if element smaller than pivot is found
                // swap it with the greater element pointer by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return i + 1;
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            // find pivot element such that
            // element smaller than pivot are on the left
            // element greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] data = {18, 5,0,11,2,9,100, -1};
        System.out.println("Unsorted Array" + Arrays.toString(data));

        int size = data.length;

        // call quickSort() on array data
        QuickSort.quickSort(data, 0, size-1);
        System.out.println("Sorted Array in Ascending order: " + Arrays.toString(data));
    }
}