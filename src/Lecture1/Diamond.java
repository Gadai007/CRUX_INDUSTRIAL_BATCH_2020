package Lecture1;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int k = 1;
        while (row <= 2*n - 1){
            int space = 1;
            while (space <= n-k){
                System.out.print(" ");
                space = space + 1;
            }
            int col = 1;
            while ( col <= 2*k - 1){
                System.out.print("*");
                col = col + 1;
            }
            if (row < n){
                k = k + 1;
            }
            else{
                k = k -1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}


