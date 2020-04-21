package Lecture24_DP;

import java.util.Scanner;

public class Dicecount {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] mem = new int[n+1];
//        int target = s.nextInt();
//        System.out.println(dicecount(4,6));
//        System.out.println(diceDP(n,mem));
        System.out.println(diceIterative(n,mem));
    }
    public static int dicecount(int target, int faces){
        if (target == 0){
            return 1;
        }
        int count = 0;

        for (int i = 1; i <= target && i <= faces ; i++) {
            count +=dicecount(target - i, faces);
        }
        return count;
    }

    public static int diceDP(int target, Integer[] mem){
        if (target == 0){
            return 1;
        }

        if(mem[target] != null){
            return mem[target];
        }

        int count =0;

        for (int i = 1; i <= target && i <= 6 ; i++) {
            count += diceDP(target-i,mem);
        }
        mem[target] = count; //saving the value of the count in the particular index

        return  mem[target];
    }

    public static int diceIterative(int target, int[] mem){

        mem[0] = 1;


        for (int i = 1; i <= target ; i++) {

            for (int j = 1; j <=i && j <= 6 ; j++) {

                mem[i] = mem[i] + mem[i-j];
            }
        }
        return mem[target];
    }
}
