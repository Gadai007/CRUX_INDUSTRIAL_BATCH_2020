package Lecture7;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fbo(3));
    }
    public static int fbo(int n){
        if (n < 2){
            return  n;
        }
        return fbo(n-1) + fbo(n-2);
    }
}
