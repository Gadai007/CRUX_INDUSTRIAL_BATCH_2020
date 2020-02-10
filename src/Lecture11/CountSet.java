package Lecture11;

public class CountSet {
    public static void main(String[] args) { // count the number of 1's in the bit
        System.out.println(count(6,0));

    }
    public static int count(int n, int count){
        while ( n > 0){
            if ((n & 1)== 1){
                count++;
            }
           n = n >> 1;
        }
        return count;
    }
}
