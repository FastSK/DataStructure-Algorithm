package Search;

/**
 * Binary Search Recursive / Iterative Method
 * - find an element's position in a sorted array.
 */
class BinarySearch {
    int binarySearchRecursive(int[] arr, int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // if x = arr[mid]
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) { // search the left half
                return binarySearchRecursive(arr, x, low, mid - 1);
            } else {  // search the right half
                return binarySearchRecursive(arr, x, mid + 1, high);
            }
        }
        return -1;
    }

    int binarySearchIterative(int[] arr, int x, int low, int high) {
        // repeat until the pointers low and high meet each other
        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) { // right
                low = mid + 1;
            } else { // left
                 high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Recursive Binary search: index of element.
        System.out.println(search.binarySearchRecursive(arr, 3, 0, n - 1));
        System.out.println(search.binarySearchRecursive(arr, 6, 0, n - 1));

        // Iterative Binary search: index of element.
        System.out.println(search.binarySearchIterative(arr, 3, 0, n - 1));
        System.out.println(search.binarySearchIterative(arr, 6, 0, n - 1));
    }
}
