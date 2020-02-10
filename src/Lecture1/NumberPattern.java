package Lecture1;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int var = 1;
        while ( row <= n){
            int col = 1;
            while ( col <= row){
                System.out.print(var);
                var++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
