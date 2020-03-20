package BinarySearchTree;

import BinaryTree.BinaryTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value = value;
        }
    }
    public void insert(int value){
        this.root = insert(this.root,value);
    }

    private Node insert(Node node, int value){
        if (node == null){
            return new Node(value);
        }

        if (node.value> value){
            node.left = insert(node.left,value);
        }
        else {
            node.right = insert(node.right,value);
        }
        return node;
    }
    public void preorder(){
        preorder(root,"");
    }
    private void preorder(Node node,String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        preorder(node.left, indent + "\t");
        preorder(node.right, indent + "\t");
    }

    public int successor(int value){
        Node success = null;
        Node current = root;
        while (current != null){

            if (current.value > value){
                if (success == null || success.value > current.value){

                    success = current;
                }
                current = current.left;
            }
            else  {
                current = current.right;
            }
        }
        return success.value;
    }

    public void kinrange(int k1,int k2){
        kinrange(root,k1,k2);
    }
    private void kinrange(Node node, int k1, int k2){
        if (node == null){
            return;
        }
        if ( node.value > k1 && node.value < k2){
            System.out.println(node.value);
        }
        if (node.value > k1){
            kinrange(node.left,k1,k2);
        }
        if (node.value <k2){
            kinrange(node.right,k1,k2);
        }
    }
    public void sort(){
        sort(root);
    }
    public void sort(Node node){     //In-order traversal(gives sorted tree)
        if ( node == null){
            return;
        }
        sort(node.left);
        System.out.println(node.value);
        sort(node.right);
    }

    public void array2tree(int[] ar, int start, int end){
        if (start > end){
            return;
        }
        int mid = (start + end)/2;

        insert(ar[mid]);

        array2tree(ar,start,mid-1);
        array2tree(ar,mid+1,end);
    }

    public void levelorder(){
        if ( root == null){
            return;
        }
        Queue<Node> queue = new LinkedList();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.println(temp.value);

            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null)
                queue.add(temp.right);
            }
        }

        public void populatebyprein(int[] pre, int[] in){
            this.root = populatebyprein(root,pre,in);
        }
        private Node populatebyprein(Node node, int[] pre, int[] in){

        if(in.length == 0){
            return null;
        }
            int element = pre[0];
            int index = find(in,element);

            int[] pre_left = Arrays.copyOfRange(pre,1,index+1);
            int[] pre_right = Arrays.copyOfRange(pre,index + 1,pre.length);

            int[] in_left = Arrays.copyOfRange(in,0,index);
            int[] in_right = Arrays.copyOfRange(in,index+1,in.length);

            Node node1 = new Node(element);

            node1.left = populatebyprein(node1.left,pre_left,in_left);
            node1.right = populatebyprein(node1.right,pre_right,in_right);

            return node1;
        }

    private int find(int[] in, int element) {

        for (int i = 0; i < in.length ; i++) {
            if (in[i] == element){
                return i;
            }
        }
        return -1;
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

}

