package TREES;

public class BinarySearchTree {

    public static class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;

        public BinaryNode(int value) {
            this.value = value;
        }
    }

    public BinaryNode root;

    public static BinaryNode insert(BinaryNode root, int value) {
        if (root == null) {
            root = new BinaryNode(value);
            return root;
        }

        if (value < root.value) {
            root.left = insert(root.left, value);

        }
        if (value > root.value) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inorder(BinaryNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    // Driver method
    public static void main(String[] args) {
        BinaryNode root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        // Print inorder traversal of the BST
        inorder(root);


    }
}
