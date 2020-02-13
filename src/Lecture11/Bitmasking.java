package Lecture11;

import java.util.Scanner;

public class Bitmasking {                   //Check the number is odd or even.
    public static void main(String[] args) {

        Scanner s = new Scanner((System.in)); //if last bit of the number is 001 then it is odd
        int n = s.nextInt();

        if ((n & 1) == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
}
