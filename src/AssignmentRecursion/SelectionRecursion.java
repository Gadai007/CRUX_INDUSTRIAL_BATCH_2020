package AssignmentRecursion;

import Lecture3_Array_Sorting.ArraySwap;
import Lecture3_Array_Sorting.Utils;

import java.util.Arrays;

public class SelectionRecursion {
    public static void main(String[] args) {

        int[] ar = {5,4,3,2,1};
        selection(ar,4,0);
        System.out.println(Arrays.toString(ar));

    }public static void selection(int[] ar, int row, int col){
        if (row == col){
            return;
        }
        if ( row == col){
            selection(ar,row-1,col);
            return;
        }
        int index = Utils.maxindex(ar,0,ar.length-col-1);
        ArraySwap.swap(ar,index,ar.length-col-1);

        selection(ar,row,col + 1);
    }
}
