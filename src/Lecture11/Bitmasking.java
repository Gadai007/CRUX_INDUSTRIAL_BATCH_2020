package Lecture11;

import java.util.Scanner;

public class Bitmasking {                   //Check the number is odd or even.
    public static void main(String[] args) {

        Scanner s = new Scanner((System.in));
        int n = s.nextInt();

        if ((n & 1) == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
}
