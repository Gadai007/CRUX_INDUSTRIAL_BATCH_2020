package Lecture6;

import java.util.Scanner;

public class Piexchange {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i <n ; i++) {
            String ss = s.nextLine();
            System.out.println(pi(ss));
        }
    }
    public static String pi(String s){
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == 'p' && s.charAt(i+1) == 'i'){
                b.append(3.14);
                i = i+1;
            }
            else {
                b.append(s.charAt(i));
            }
        }
        return b.toString();
    }
}
