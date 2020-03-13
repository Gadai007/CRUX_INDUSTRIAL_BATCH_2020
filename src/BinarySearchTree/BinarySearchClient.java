package BinarySearchTree;

public class BinarySearchClient {
    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(5);
//        tree.insert(2);
//        tree.insert(7);
//        tree.insert(3);
//        tree.insert(1);

        //System.out.println(tree.successor(1));
        //tree.kinrange(1,7);
        //tree.preorder();
        //tree.sort();
        int[] ar = {1,2,3,4,5,6,7};
        tree.array2tree(ar,0,ar.length-1);
        tree.preorder();

    }
}
