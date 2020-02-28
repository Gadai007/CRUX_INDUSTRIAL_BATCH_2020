package AssignmentRecursion2;

public class AsciiSubsequence {
    public static void main(String[] args) {
      asciisubsequence("","ab");
    }
    public static void asciisubsequence(String processed,String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        asciisubsequence(processed + ch,unprocessed);
        asciisubsequence(processed + (int)(ch),unprocessed);
        asciisubsequence(processed, unprocessed);
    }
}
