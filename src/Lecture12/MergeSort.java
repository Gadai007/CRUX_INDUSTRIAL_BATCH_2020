package Lecture12;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] first = {2,3,6};
//        int[] second = {4,7,8};
//        int[] arg = merge(first,second);
//        System.out.println(Arrays.toString(arg));

        int[] ar = {3,4,1,2,6,5};
        System.out.println(Arrays.toString(mergesort(ar)));
    }
    public static int[] merge(int[] first,int[] second){
        int[] res = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while ( i < first.length && j < second.length){
            if (first[i] < second[j]){
                res[k]= first[i];
                k++;
                i++;
            }
            else {
                res[k] = second[j];
                k++;
                j++;
            }
        }
        while (i < first.length){
            res[k]= first[i];
            k++;
            i++;
        }
        while (j < second.length){
            res[k] = second[j];
            k++;
            j++;
        }
        return res;
    }
    public static int[] mergesort(int[] nums){

        if (nums.length == 1){
            return nums;
        }
        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] second = Arrays.copyOfRange(nums,mid,nums.length);

        first = mergesort(first);
        second = mergesort(second);

        return merge(first,second);
    }
}
