package AssignmentRecursion2;

import java.util.Scanner;

public class Xfactor {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String ss = s.nextLine();
        xfactor(ss,"",0,0);
    }
    public static void xfactor(String s1, String s2, int index, int count){
        if (s1.length() == index){
            while (count > 0) {
                s2 = s2 + 'x';
                count--;
            }
            System.out.println(s2);
            return;
        }
        if (s1.charAt(index) == 'x'){
            count++;
        }
        else {
            s2 = s2 + s1.charAt(index);
        }
        xfactor(s1,s2,index+1,count);
    }
}
