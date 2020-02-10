package Lecture10;

import java.util.Arrays;

public class LexoPermutation {
    public static void main(String[] args) {
        String s = "abc";

        int[] fre = frequency(s);
        System.out.println(Arrays.toString(fre));

        lexoperm(fre,"",3);
    }
    public static int[] frequency(String s){
        int ar[] = new int[26];

        for (int i = 0; i <s.length() ; i++) {

            char ch = s.charAt(i);

            ar[ch - 'a']++;
        }
        return ar;
    }
    public static void lexoperm(int[] fre, String processed, int length){

        if (processed.length() == length){

            System.out.println(processed);
            return;
        }

        for (int i = 0; i <fre.length ; i++) {

            if (fre[i] > 0){

                fre[i]--;
                lexoperm(fre,processed + (char)(i + 'a'), length);
                fre[i]++;
            }
        }
    }
}
