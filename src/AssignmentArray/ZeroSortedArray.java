package AssignmentArray;

import java.util.Scanner;

public class ZeroSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i <n ; i++) {
            ar[i] = s.nextInt();
        }
        sort(ar);
        for (int i = 0; i <n ; i++) {
            System.out.println(ar[i] + " ");
        }

    }
    public static int[] sort(int[] ar){
        int count = 0;
        for (int i = 0; i <ar.length ; i++) {
            if ( ar[i] == 0){
                count = count + 1;
            }
        }
        for (int j = 0; j < ar.length ; j++) {
            if (ar[j] < count){
                ar[j] = 0;
            }
            else{
                ar[j] = 1;
            }
            count--;
        }
        return  ar;
    }
}
