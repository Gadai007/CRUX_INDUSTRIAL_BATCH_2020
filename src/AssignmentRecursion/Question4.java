package AssignmentRecursion;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int[] arr = {};
        invert(ar,arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void invert(int ar[], int arr[], int index){
        if (index == arr.length){
            return;
        }
        int temp = ar[index];
        ar[temp] = index;
        invert(ar,arr,index+1);
    }
}
