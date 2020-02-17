package Lecture6;

public class MaxFrequency {
    public static void main(String[] args) {
        maxFreq("aabbcc");
    }
    public static int maxFreq(String str){
        int count1 = 1;
        char ch = str.charAt(0);
        char ch1 = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            int count2 = 1;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count2++;
                    ch = str.charAt(i);
                }
            }
            if (count2 > count1){
                count1 = count2;
                ch1 = ch;
            }
        }
        System.out.println(ch1);
        return count1;
    }
}
