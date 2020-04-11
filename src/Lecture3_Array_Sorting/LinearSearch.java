package Lecture3_Array_Sorting;

public class LinearSearch {
    public static void main(String[] args) {

        int[] ar = {1,2,2,4,5};

        System.out.println(linear(ar, 2));
        int r = linear(ar, 2);
        if (r == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Found");
        }
    }
    public static int linear(int ar[], int element){

        for(int i = 0; i< ar.length; i++){

            if ( ar[i] == element){
                return  i;
            }
        }
        return  -1;
    }
}
