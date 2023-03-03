package Search;

/**
 * Searching operation in smaller arrays (<100 data)
 * Time complexity : O(n)
 * Space Complexity : O(1)
 */

import javax.sound.sampled.Line;

public class LinearSearch {
    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i]== x) {
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 9};
        int x = 4 ;

        System.out.println(linearSearch(arr, x));
    }
}
