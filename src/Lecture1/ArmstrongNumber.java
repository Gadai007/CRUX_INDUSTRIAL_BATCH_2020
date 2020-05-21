package Lecture1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(armstrong(153));
    }
    public static boolean armstrong(int n){
        int n1 = n;
        int count =0;
        while (n1!=0){
            n1=n1/10;
            count++;
        }
        int sum =0;
        int arm = n;
        int place = count;
        while (n > 0){
            int r = n%10;
            n = n / 10;
            sum = sum + (int)Math.pow(r,place);
        }
        if (arm == sum) {
            return true;
        }
        else {
            return false;
        }
    }
}
