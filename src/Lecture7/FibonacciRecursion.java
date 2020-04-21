package Lecture7;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fbo(4));
      //  fbo(4);
    }
    public static int fbo(int n){
        if (n < 2){
            return  n;
        }
        return fbo(n-1) + fbo(n-2);
    }
}
