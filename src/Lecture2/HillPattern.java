package Lecture2;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;

        while ( row <= n){
            int col = 1;
            int sm = 1;
            while ( col <= 2*n - 1){

                if ( sm <= row){
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

            System.out.println();
            row++;
        }
    }
}
