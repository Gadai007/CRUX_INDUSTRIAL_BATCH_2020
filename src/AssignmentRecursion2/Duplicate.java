package AssignmentRecursion2;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        duplicate(ss,"",0);
    }
    public static void duplicate(String s1, String s2, int index) {
        if (s1.length() == index){
            System.out.println(s2);
            return;
        }
        if (index == s1.length()-1){
            s2 = s2 + s1.charAt(index);
        }
        else if(s1.charAt(index) != s1.charAt(index+1)){
            s2 = s2 + s1.charAt(index) ;
        }
        else {
            s2 = s2;
        }

        duplicate(s1,s2,index+1);
    }
}
