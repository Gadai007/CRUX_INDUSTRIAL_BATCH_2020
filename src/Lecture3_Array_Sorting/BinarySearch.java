package Lecture3_Array_Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        //System.out.println(search(ar, 4));
        search(ar, 4);
    }
    public static int search(int ar[], int element){
        int start = 0;
        int end = ar.length - 1;
        while ( start <= end){

            int mid = (start + end)/2;
            if (ar[mid] == element){
                return mid;
            }
            else if (ar[mid] < element){
                 start = mid + 1;
            }
            else {
                 end = mid - 1;
            }
        }
        return  -1;
    }
}
