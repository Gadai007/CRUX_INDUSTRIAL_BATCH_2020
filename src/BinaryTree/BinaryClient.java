package BinaryTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClient {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("binary.txt");




        Scanner s = new Scanner(f);

        BinaryTree tree = new BinaryTree();
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);


        tree.display();
        //System.out.println(tree.height());
        System.out.println(tree.search(10));
    }
}
