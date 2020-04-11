package GenericTrees;

import java.io.File;

public class FileTraversal {
    public static void main(String[] args) {

        File f = new File(".");

        display(f, "");
    }

    private static void display(File file, String indent) {

        System.out.println(indent + file.getName());

        if (file.isDirectory()){
            for (int i = 0; i < file.listFiles().length ; i++) {
                File f = file.listFiles()[i];
                display(f, indent + "\t");
            }
        }
    }
}
