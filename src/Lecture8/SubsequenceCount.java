package Lecture8;

public class SubsequenceCount {
    public static void main(String[] args) {
        System.out.println(subsequence("abcd",""));

    }
    public static int subsequence(String s1, String s2){
        if (s1.isEmpty()){
            System.out.println(s2);
            return 1;
        }
        int count = 0;
        char ch = s1.charAt(0);
        s1 = s1.substring(1);

        count += subsequence(s1,s2 + ch);
        count +=subsequence(s1,s2);

        return count;
    }
}
