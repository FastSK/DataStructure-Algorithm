package TreeDSA.BinaryTree.option1;
/**
 * Binary Search Tree
 * - Tree data structure, where each node is greater than it's left child, less than it's right.
 * pros. easy to locate a node when they are in this order
 *
 * time complexity = Best O(log n) / Worst O(n)
 * space complexity = O(n)
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(3));
        tree.insert(new Node(7));
        tree.insert(new Node(2));
        tree.insert(new Node(11));
        tree.insert(new Node(51));

        tree.remove(1);
        tree.remove(7);
        tree.display();

        System.out.println(tree.search(5)); // true
        System.out.println(tree.search(1)); // false

    }
}
