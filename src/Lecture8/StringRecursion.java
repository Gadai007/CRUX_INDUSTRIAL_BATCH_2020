package Lecture8;

public class StringRecursion {
    public static void main(String[] args) {
        subsequence("","ba");

    }
    public  static void subsequence(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);// ch =a
        unprocessed = unprocessed.substring(1);// unprocessed = bc

        subsequence(processed + ch,unprocessed);
        subsequence(processed ,unprocessed);
    }
}
