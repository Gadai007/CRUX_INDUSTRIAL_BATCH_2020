package Lecture24_DP;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] ar = new Integer[n+1];
//        System.out.println(fiboDP(n,ar));
//        System.out.println(fibo(5));
        System.out.println(fiboIterative(n,ar));
    }

    public static int fibo(int n){
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int fiboDP(int n , Integer[] mem){

        if(n<2){
            return n;
        }

        if(mem[n] != null){
            return mem[n];
        }

        mem[n] = fiboDP(n-1,mem) + fiboDP(n-2,mem);
        return mem[n];
    }

    public static int fiboIterative(int n, Integer[] mem){
       mem[0] =0;
       mem[1] =1;

        for (int i = 2; i <= n ; i++) {

            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n];
    }
}

