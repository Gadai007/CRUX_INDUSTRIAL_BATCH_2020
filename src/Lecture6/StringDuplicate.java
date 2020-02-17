package Lecture6;

public class StringDuplicate {
    public static void main(String[] args) {
        duplicate("aabbcc","");
    }
    public static void duplicate(String s1, String s2){
        for (int i = 0; i <s1.length() ; i++) {
            for (int j = i + 1; j < s1.length() ; j++) {
                if(s1.charAt(i) == s1.charAt(j)){
                    s2 = s2 + s1.charAt(j);
                }
            }
        }
        System.out.println(s2);
    }
}
