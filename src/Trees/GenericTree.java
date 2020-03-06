package Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {

    private Node root;

    public void populate(Scanner scanner){
        this.root = this.populateRec(scanner);
    }

    private  Node populateRec(Scanner scanner){
//            System.out.println("Enter the value for node: ");

            int value = scanner.nextInt();
            Node node =new Node(value);

//            System.out.println("How many children for " + value + ": ");
            int count_children = scanner.nextInt();

            for (int i = 0; i < count_children ; i++) {

//                System.out.println(" adding child "+ i +" of " + value + " ");
                Node child =this.populateRec(scanner);
                node.children.add(child);
            }
            return node;

    }
    public void display(){
        this.display(this.root, "");
    }

    private void display(Node node, String indent) {
        System.out.println(indent + node.value);

        for (int i = 0; i <node.children.size() ; i++) {
            this.display(node.children.get(i), indent + "\t");
        }
    }

    private static class Node{
        private Integer value;
        private ArrayList<Node> children;

        public Node(Integer value){
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
