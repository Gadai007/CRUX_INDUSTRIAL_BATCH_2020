package Lecture4;

import Lecture3.Utils;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
         int[] ar = {1,2,3,4,5,6,7};

         int k =2;

        Utils.reverse(ar,0,k-1);
        System.out.println(Arrays.toString(ar));

        Utils.reverse(ar,k,ar.length-1);
        System.out.println(Arrays.toString(ar));

        Utils.reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
}
