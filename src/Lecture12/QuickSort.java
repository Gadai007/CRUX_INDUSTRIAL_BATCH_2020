package Lecture12;

import Lecture3.ArraySwap;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ar = {0,1,2,1,2};
        quicksort(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    public static void quicksort(int[] ar, int start, int end){
        if (start >= end){
            return ;
        }

        int p = pivot(ar,start,end);

        quicksort(ar,start,p-1);
        quicksort(ar,p+1,end);
    }

    private static int pivot(int[] ar, int start, int end) {
        int j = start;
        for (int i = start; i < end ; i++) {
            if (ar[i] < ar[end]){
                ArraySwap.swap(ar,i,j);
                j++;
            }
        }
        ArraySwap.swap(ar,j,end);
        return j;
    }
}
