package Lecture12;

public class MagicalNumbers {
    public static void main(String[] args) {
        //System.out.println(magical(5));
        magical(5);
    }
    public static int magical(int n){
        int result = 0;
        int place = 1;
        while ( n > 0){
            if ((n & 1)==1){
                result = result + (int)(Math.pow(5,place));
            }
            n = n >> 1;
            place = place + 1;
        }
        return result;
    }
}
