package TreeDSA.BinaryTree.option1;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {  //Q. Why node? not a data
         // assign root node
        root = insertHelper(root, node); // use helper method  to use recursion
    }
    private Node insertHelper(Node root, Node node) {
        int data = node.data; // assign node and its data passing in
        if (root == null) {
            root = node; // * assign this to the root node because it is the first node
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;  // return current root node
    }

    public void display() { //No parameter needed
        displayHelper(root);
    }
    private void displayHelper(Node root) {
        if (root != null) {
            // inorder traversal (ascending order)
            displayHelper(root.left);
            System.out.println(root.data); //root.data not root
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(Node root, int data) {
        if (root == null){
            return false;
        } else if (root.data == data){
            return true;
        } else if (root.data > data){
            return searchHelper(root.left, data);
        } else {
        return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if(search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " not found");
        }
    }
    public Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (root.data > data) {
            root.left = removeHelper(root.left, data); // why root.left?
        } else if (root.data < data) {
            root.right = removeHelper(root.right, data);
        } else { // node found == leaf node
            if (root.left == null && root.right == null) {
                root = null; // set current node equals to null
            } else if (root.right != null) { // find a successor to replace this node
                root.data = succeccor(root);
                root.right = removeHelper(root.right, root.data);
            } else { // find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int succeccor(Node root) { // find the least value below the right child of this root node
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(Node root) { // find the greatest value below the left child of this root node
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

}
