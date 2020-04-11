package Lecture8;

import Lecture3_Array_Sorting.ArraySwap;

import java.util.Arrays;

public class BubbleRecursion {
    public static void main(String[] args) {
       int[] ar = {5,4,3,2,1};
       bubble(ar,4,0);
       System.out.println(Arrays.toString(ar));

    }
    public static void bubble(int ar[],int row, int col){
        if (row == 0){
            return;
        }
        if (col == row){

            bubble(ar,row-1,0);
            return;
        }
        if (ar[col] > ar[col + 1]){
            ArraySwap.swap(ar,col,col+1);
        }
        bubble(ar,row,col+1);
    }
}
