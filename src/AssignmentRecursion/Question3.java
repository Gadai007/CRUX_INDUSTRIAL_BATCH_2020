package AssignmentRecursion;

import Lecture3_Array_Sorting.ArraySwap;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] ar = {5,4,3,2,1};
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
    public static void reverse(int ar[], int start, int end) {
        if (end == 0) {
            return;
        }
        if (start <= end) {
            ArraySwap.swap(ar, start, end);
            reverse(ar, start + 1, end - 1);
        }

    }
}
