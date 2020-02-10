package Lecture5;

import java.util.Scanner;

public class MDQuestion2 { // JALEBI PRINT
    public static void main(String[] args) {
        int ar[][] = new int[4][4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        int top = 0;
        int left = 0;
        int bottom = ar.length-1;
        int right = ar[0].length-1;
        while ( top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                System.out.println(ar[top][i]);
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                System.out.println(ar[i][right]);
            }
            right--;
            for (int i = right; i >= left ; i--) {
                System.out.println(ar[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top ; i--) {
                System.out.println(ar[i][left]);
            }
            left++;
        }

    }
}
