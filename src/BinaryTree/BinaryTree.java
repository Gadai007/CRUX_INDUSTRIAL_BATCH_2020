package BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;


    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
    }
    public void insert(Scanner s){
        this.root = insert(this.root,s);
    }
    private Node insert(Node node, Scanner s){
        if (node == null){         //traverse from the end of the tree to root node and makes the links.
            System.out.println("Enter the value");
            int value = Integer.parseInt(s.nextLine());
//            Node node1 = new Node(value);
            return new Node(value);     //return node1;
        }
        System.out.println("Enter the direction");
        String dir = s.nextLine();

        if (dir.equals("left")){
            node.left = insert(node.left,s);
        }
        else {
            node.right = insert(node.right,s);
        }
        return node; //this line makes the link.
    }
    public void display(){
        display(this.root,"");
    }

    private void display(Node node, String indent) {  //pre-order traversal
        if (node == null){
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }
    public void postorder(){
        postorder(this.root,"");
    }
    private void postorder(Node node, String indent){
        if (node == null){
            return;
        }
        postorder(node.left, indent + "\t");
        postorder(node.right, indent + "\t");
        System.out.println(indent + node.value);
    }
    public int height(){
        return height(root);
    }

    private int height(Node node){
        if (node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }

    public Boolean search(int element){
        return search(root,element);
    }

    public Boolean search(Node node,int element){
        if (node == null){
            return false;
        }

        if (node.value == element){
            return true;
        }
        return search(node.left,element) || search(node.right,element);
    }

//    private int diameter(Node node){
//        Node current = 1 + height(node.left) + height(node.right);
//    }
    public void mirror(){
        mirror(root);
    }
    private void mirror(Node node){
        if (node == null) {
            return;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        mirror(node.left);
        mirror(node.right);
    }
}
