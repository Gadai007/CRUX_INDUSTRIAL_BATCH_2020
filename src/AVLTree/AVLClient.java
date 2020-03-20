package AVLTree;

public class AVLClient {
    public static void main(String[] args) {
        AVL tree=new AVL();
//        tree.insert(3);
//        tree.insert(2);
//        tree.insert(1);
        tree.insert(1);
        tree.insert(4);
        tree.insert(3);

        tree.displaypreorder();
//        System.out.println(tree.isbalanced());
    }
}
