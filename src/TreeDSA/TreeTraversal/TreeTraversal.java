//package TreeDSA.TreeTraversal;
//
//class Node {
//    int data;
//    Node left, right;
//
//    public Node(int data) {
//        this.data = data;
//        left = right = null; // ???
//    }
//}
//
//class BinaryTree {
//
//    // Root of Binary Tree
//    Node root;
//
//    BinaryTree() {  // ???A
//        root = null;
//    }
//
//    void postorder(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        postorder(node.left);
//        postorder(node.right);
//        System.out.print(node.data + " ");
//    }
//
//    void preorder(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        System.out.print(node.data + " ");
//        preorder(node.left);
//        preorder(node.right);
//    }
//
//    void inorder(Node node) {
//        if (node == null) {
//            return;
//        }
//        inorder(node.left); // not root.left, but node.left
//        System.out.print(node.data + " ");
//        inorder(node.right);
//    }
//    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//
//        tree.root = new Node(1);
//        tree.root.left = new Node(12);
//        tree.root.right = new Node(9);
//        tree.root.left.left = new Node(5);
//        tree.root.left.right = new Node(6);
//
//        System.out.println("Inorder: ");
//        tree.inorder(tree.root);
//        System.out.println("\npreorder: ");
//        tree.preorder(tree.root);
//        System.out.println("\npostorder: ");
//        tree.postorder(tree.root);
//    }
//}
//
//
