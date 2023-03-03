package TreeDSA.TreeTraversal;

/**
 * Binary Tree
 * - Easy and quick access to data
 */

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree1 {
    Node root;

//    BinaryTree1(int data) {
//        root = new Node(data);
//    }

    BinaryTree1() {
        root = null;
    }


    // traverse inorder
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    // traverse preorder
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            inorder(node.left);
            inorder(node.right);
        }
    }
    // traverse postorder
    void postorder(Node node) {
        if (node != null) {
            inorder(node.left);
            inorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        System.out.println("inorder: ");
        tree.inorder(tree.root);  // start from tree root
        System.out.println("\npreorder: ");
        tree.preorder(tree.root);  // start from tree root
        System.out.println("\npostorder: ");
        tree.postorder(tree.root);  // start from tree root


    }
}
