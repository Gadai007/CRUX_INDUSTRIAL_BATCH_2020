package Lecture12;

public class OddOneOut {
    public static void main(String[] args) { //Using bitmasking finding the odd one out.Using XOR operation
     int[] ar = {1,2,3,4,3,2,1};
     int sum = 0;
        for (int i = 0; i <ar.length ; i++) {
            sum = sum ^ ar[i];                 // ^ significs XOR gate
        }
        System.out.println(sum);
    }
}
