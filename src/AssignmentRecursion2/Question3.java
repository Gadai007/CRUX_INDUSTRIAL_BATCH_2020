package AssignmentRecursion2;

public class Question3 {
    public static void main(String[] args) {
        check("fes","sof",0,2);
    }
    public static boolean check(String s1, String s2, int start, int end){
        if (start >= end ){
            return true;
        }
        if (s1.charAt(start) != s2.charAt(end) || s1.length() != s2.length()){
            return false;
        }
        return check(s1, s2, start+1, end-1);
    }
}
