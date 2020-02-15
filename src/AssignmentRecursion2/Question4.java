package AssignmentRecursion2;

public class Question4 {
    public static void main(String[] args) {
        palindrome("1234",0,3);
    }
    public static boolean palindrome(String s, int start, int end){
        if (start >= end){
            System.out.println("Palindrome");
            return true;
        }
        if (s.charAt(start) != s.charAt(end)){
            System.out.println("Not Palindrome");
            return false;
        }
        return palindrome(s,start+1,end-1);
    }
}
