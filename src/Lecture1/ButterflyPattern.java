package Lecture1;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int k = 1;
        while (row <= 2*n-1 ){
            int sm = 1;
            int col = 1;
            while (col <= 2*n-1){
                if (sm <= k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                if (col < n){
                    sm++;
                }
                else{
                    sm--;
                }
                col++;
            }
            if (row < n){
                k++;
            }
            else {
                k--;
            }
            System.out.println();
            row ++;
        }
    }

}
