package Lecture3_Array_Sorting;

public class Utils {
    public static void main(String[] args) {
        int[] ar = {7, 1, 4, 6, 2, 8};
        System.out.println(maxvalue(ar));
        //System.out.println(maxindex(ar));


    }
    public static int maxvalue(int[] ar){
        int max = Integer.MIN_VALUE;
        for(int i =0; i < ar.length; i++){
            if (max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }
    public static int maxindex(int[] ar, int start, int end){
        int max = start;
        for(int i =start; i <= end; i++){
            if (ar [max] < ar[i]){
                max = i;
            }
        }
        return max;
    }
    public static void reverse(int ar[], int start, int end){
        while (start <= end){

            ArraySwap.swap(ar,start,end);

            start++;
            end--;
        }
    }

}
