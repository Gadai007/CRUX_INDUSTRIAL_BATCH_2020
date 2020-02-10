package Lecture8;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }
    public static void permutation(String processed, String unprocessed){

        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);// ch =a
        unprocessed = unprocessed.substring(1);// unprocessed = bc

        for (int i = 0; i <= processed.length() ; i++) {
            String first = processed.substring(0,i);
            String second = processed.substring(i);

            permutation(first + ch + second,unprocessed);
        }
    }
}
