package Lecture18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SCANNER {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("input.txt");

        //System.out.println(f.getAbsolutePath());

        Scanner s =new Scanner(f);

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a);
        System.out.println(b);



    }
}
