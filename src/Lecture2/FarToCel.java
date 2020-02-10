package Lecture2;

import java.util.Scanner;

public class FarToCel {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int steps = s.nextInt();
        FarToCel(start,end,steps);
    }

    public  static void FarToCel(int start, int end, int step){
       // float C =0;
        while (start <= end){
        float C = (5f/9) * (start-32);
        System.out.println(C);
        start = start+step;
        }

    }

    }

