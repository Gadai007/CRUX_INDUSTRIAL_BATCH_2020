package Lecture3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == reverse(n)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
        reverse(1234);
    }
    public static int reverse(int n){

        int rev_n = 0;

        while (n > 0){
             int r = n % 10;
             rev_n = rev_n*10 + r;
             n = n/10;
        }
        return  rev_n;
    }
}
