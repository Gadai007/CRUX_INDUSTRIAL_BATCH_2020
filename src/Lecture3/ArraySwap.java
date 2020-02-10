package Lecture3;

import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        System.out.println(ar[0]+ " " +ar[1]);
        //swap(ar, 1,2);
        System.out.println(ar[0] + " " + ar[1]);

    }
    public  static void swap(int ar[], int i, int j){

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
