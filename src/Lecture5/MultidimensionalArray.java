package Lecture5;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int ar[][] = new int[3][3];
        Scanner s = new Scanner(System.in);


        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar[i].length ; j++) {
                ar[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i <ar.length ; i++) {

            for (int j = 0; j <ar[i].length ; j++) {

                System.out.println(ar[i][j]);
            }
        }
    }
}
