package Lecture3;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int ar[] = {5,4,3,2,1};

        bubble(ar);
        selection(ar);
        insertion(ar);

        System.out.println(Arrays.toString(ar));

    }

    private static void insertion(int[] ar) {

        for (int i = 0; i <ar.length -1 ; i++) { //it is ar.length-1 because 1st element is already sorted.
            for (int j =i + 1; j >0 ; j--) {
                if (ar[j] < ar[j-1]){
                    ArraySwap.swap(ar,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void selection(int[] ar) {

        for (int i = 0; i <ar.length ; i++) {
           int index = Utils.maxindex(ar,0,ar.length-i-1);
           ArraySwap.swap(ar,index,ar.length-i-1);
        }
    }

    public static void bubble(int ar[]){

        for (int i = 0; i < ar.length ; i++){

            for (int j = 0; j <ar.length- i- 1 ; j++) {

                if(ar[j] > ar[j+1]){
                    ArraySwap.swap(ar,j,j+1);
                }
            }
        }
    }

}
