package Lecture7;

public class Factorial {
    public static void main(String[] args) {
        int r = fac(4);
        System.out.println(r);
    }
    public static int fac(int n){
        if (n==0){
            return 1;
        }
        return n*fac(n-1);
    }
}
