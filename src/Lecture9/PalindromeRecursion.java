package Lecture9;

public class PalindromeRecursion {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        System.out.println(palindrome(ar,0,ar.length-1));
    }
    public static boolean palindrome(int[] ar, int start, int end){
        if (start == end){
            return true;
        }
        if (ar[start] != ar[end]){
            return false;
        }
        return palindrome(ar,start+1,end-1);
    }
}
