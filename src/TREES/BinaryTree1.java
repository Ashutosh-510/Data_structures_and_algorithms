package TREES;

import java.util.Scanner;

public class BinaryTree1 {


    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scan){
        System.out.println("Enter the root Node: ");
        int value = scan.nextInt();
        root = new Node(value);
        populate(scan ,root);
    }

    public void populate(Scanner scan , Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scan.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scan.nextInt();
            node.left = new Node(value);
            populate(scan , node.left);
        }
        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scan.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scan.nextInt();
            node.right = new Node(value);
            populate(scan , node.right);
        }
    }

    public void display(){
        display(root," ");
    }
    private void display(Node node , String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BinaryTree1 tree = new BinaryTree1();
        tree.populate(scan);
        tree.display();
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

}
