package Lecture11;

public class BitmaskingSwap {
    public static void main(String[] args) {

        swap(10,6);

    }
    public static void swap(int x,int y){
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);

    }
}
