package Lecture4;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //System.out.println(root(n));
         float ans = root(n);

         float t = 0.1f;

         int precision = 4;

         for (int i =0; i < precision ; i++){
             while ( ans*ans < n){
                 ans = ans + t;
             }
             ans = ans - t;
             t= t/10;
         }
        System.out.printf("% 4f",ans);
    }
    public static int root(int n){
        int start = 0;
        int end = n;
        int ans = 0;
        while (start <= end){

            int mid = (start + end )/2;
            if (mid*mid==n){
                return  mid;
            }
            else if(mid*mid >n){
                end = mid -1;
            }
            else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
