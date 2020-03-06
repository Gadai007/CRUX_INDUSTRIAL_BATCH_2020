package Trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("treeinput.txt");

        Scanner scanner = new Scanner(f);

//        Scanner s =new Scanner(System.in);

        GenericTree tree = new GenericTree();
        tree.populate(scanner);

        tree.display();
    }
}
