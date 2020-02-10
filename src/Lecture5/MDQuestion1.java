package Lecture5; //WAVE PRINT

import java.util.Scanner;

public class MDQuestion1 {
    public static void main(String[] args) {

        int ar[][] = new int [2][2];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar[i].length ; j++) {
                ar[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i <ar.length ; i++) {
            if(i%2==0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.println(ar[i][j]);
                }
            }
            else {
                for (int j = ar.length -1; j >= 0; j--) {
                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}
