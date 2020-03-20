package AVLTree;



public class AVL {
    private class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
            this.height=1;
        }
    }
    private Node root;
    public void insert(int value){
        this.root=insert(root,value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (node.value > value) {
            node.left = insert(node.left, value);
        } else if (node.value < value) {
            node.right = insert(node.right, value);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        node=balancefactor(node);
        return node;
    }
    public int height(Node node){
        if(node==null){
            return 0;
        }
        return node.height;
    }

    public boolean isbalanced(){
        return isbalanced(this.root);
    }
    private boolean isbalanced(Node node){

        if(node==null){
            return true;
        }

        int diff=Math.abs(height(node.left)-height(node.right));
        if(diff>1){  //it will never be negative.
            return false;
        }
        boolean left=isbalanced(node.left);
        boolean right=isbalanced(node.right);
        return left && right;
    }

    public Node balancefactor(Node node){
        if(height(node.left)-height(node.right)>1){
            
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftrotation(node.left);
            }
            return rightrotation(node);
        }
        if(height(node.left)-height(node.right)<-1){
            if(height(node.right.left)-height(node.right.right)>0){
                node.right=rightrotation(node.right);
            }
            return leftrotation(node);
        }
        return node;
    }

    private Node rightrotation(Node x) {
        Node y=x.left;
        Node temp=y.right;
        y.right=x;
        x.left=temp;
        x.height=Math.max(height(x.left),height(x.right))+1;
        y.height=Math.max(height(y.left),height(y.right))+1;
        return y;
    }


    private Node leftrotation(Node y) {
            Node x=y.right;
            Node temp=x.left;
            x.left=y;
            y.right=temp;
            y.height=Math.max(height(y.left),height(y.right))+1;
            x.height=Math.max(height(x.left),height(x.right))+1;
            return x;

    }
    public void displaypreorder() {
        displaypreorder(root, "");
    }


    private void displaypreorder(Node node, String indent) {//this is of pre order representation
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        displaypreorder(node.left, indent + "\t");
        displaypreorder(node.right, indent + "\t");

    }
}
