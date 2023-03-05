package Java.oop.recursion;

/**
 * Recursion
 * Cons
 *      When a recursive call is made, new storage locations for variables are allocated on the stack.
 *      As, each recursive call returns, the old variables and parameters are removed from the stack.
 *      Hence, recursion is slower, and takes up more of the stack as well.
 *
 * Pros
 *      For instance, tree traversal it makes the algorithm a little easier or more "elegant".
 */


class Factorial{
    static int factorial(int n) {   // static int works  / static class did not work.
        if (n != 0) {
            return n * factorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(factorial(num));
    }
}
