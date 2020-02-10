package Lecture1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int f =0;
        int s = 1;
        int t = 0;
        while (n > 0){
            t = f + s;
            f = s;
            s = t;
            n--;
        }
        System.out.println(f);

    }
}

