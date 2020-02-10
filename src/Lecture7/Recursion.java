package Lecture7;

public class Recursion {
    public static void main(String[] args) {
        pd1(4);
        //pd2(4);
        //pd3(4);
    }
    public static void pd1(int n){
        if(n==0){
            return;
        }
        pd1(n-1);
        System.out.println(n);
    }
    public static void pd2(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd2(n-1);
    }
    public static void pd3(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        pd3(n-1);
        System.out.println(n);
    }
}
