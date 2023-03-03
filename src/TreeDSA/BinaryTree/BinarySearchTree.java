package TreeDSA.BinaryTree;

/**
 * Binary Search Tree
 *
 * Time Complexity
 * Search best: O(log n), worst: O(n)
 * Insertion best: O(log n), worst: O(n)
 * Deletion best: O(log n), worst: O(n)
 *
 * Space Complexity : O(n)
 */


class BinarySearchTree {

    class Node {
        int data; // data
        Node left, right; // two pointers

        public Node(int item) {  // constructor
            data = item;
            left = right = null;
        }
    }

    // Root of Binary Tree
    Node root;

    BinarySearchTree() {

        root = null;
    }

    void insert(int data) {
        root = insertData(root, data); // use recursive insertData method
    }
    // Insert data in the tree
    Node insertData(Node root, int data) {
        // return a new node if the tree is empty
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Traverse to the right place and insert the node
        if (data < root.data) {
            root.left = insertData(root.left, data);
        } else if (data > root.data) {
            root.right = insertData(root.right, data);
        }

        return root;  // return current root node
    }

    // Wrappers over the below recurvice inorderRec function
    void inorder() {
        inorderRec(root); // invoke inorderRec method pass in root node
    }
    // Inorder Traversal
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data + " -> ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
    }
    // Preorder traversal
    void preorderRec(Node root){
        if (root != null) {
            System.out.println(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
    }
    // postorder traversal
    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.println(root.data + " ");
        }
    }

    void deleteData(int data) {
        root = deleteRec(root, data);
    }
    Node deleteRec(Node root, int data) {
        // return if the tree is empty
        if (root == null) {
            return root;
        }

        // find the node to be deleted;
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // if the node it with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // if the node has two children
            // place the inorder successor in position of the node to be deleted
            root.data = minValue(root.right);

            // delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    // find the inorder successor
    int minValue(Node root) {
        int minV = root.data;
        while (root.left != null) {
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);
        tree.insert(5);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.println("\n\nAfter deleting 10");
        tree.deleteData(10);
        System.out.print("Inorder traversal: ");
        tree.inorder();
    }
}
