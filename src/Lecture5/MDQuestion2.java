package Lecture5;

import GenericTrees.Scan;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class MDQuestion2 { // JALEBI PRINT
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int ar[][] = new int[N][];
        for(int i=0;i<N;i++){
            ar[i]=new int[M];
            for(int j=0;j<M;j++){
                ar[i][j]=s.nextInt();
            }
        }

        int top = 0;
        int left = 0;
        int bottom = ar.length-1;
        int right = ar[0].length-1;
        while ( top <= bottom && left <= right){

            for(int i = left; i <= right; i++){
                System.out.print(ar[top][i] + ", ");
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                System.out.print(ar[i][right] + ", ");
            }
            right--;
            for (int i = right; i >= left ; i--) {
                System.out.print(ar[bottom][i] + ", ");
            }
            bottom--;
            for (int i = bottom; i >= top ; i--) {
                System.out.print(ar[i][left] + ", ");
            }
            left++;
        }
        System.out.println("END");
    }
}
