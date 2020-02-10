package Lecture5;

public class SearchingMD {
    public static void main(String[] args) {
        int[][] ar = {  {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
        };
        if (search(ar,4,4,4)){
            System.out.println("Element Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
    public static boolean search(int[][] ar, int m, int n, int element){
        int i = m-1;
        int j =0;
        while (i >= 0 && j<n){
            if (ar[i][j] == element){
                return true;
            }
            else if (ar[i][j] > element){
                i--;
            }
            else {
                j++;
            }
        }
        return false;
    }
}
