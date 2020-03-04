package Lecture17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class JavaApp {
    public static void main(String[] args) throws FileNotFoundException {

        File f =new File("hello.txt");

        PrintStream out = new PrintStream(f);

        out.println("Welcome to Noida");

    }
}
