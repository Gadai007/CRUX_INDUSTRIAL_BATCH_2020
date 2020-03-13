package BinarySearchTree;

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
    public void sort(Node node){
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

    public void pre_in_tree(){

    }
}
