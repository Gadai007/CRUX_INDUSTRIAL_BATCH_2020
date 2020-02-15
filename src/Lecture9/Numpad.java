package Lecture9;

public class Numpad {
    public static void main(String[] args) {
        numpad("","12");
    }
    public static void numpad(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0)-'0';
        unprocessed = unprocessed.substring(1);

        for (int i = 3*(digit - 1) ;i <3 * digit; i++) {
            if (i == 26){
                continue;
            }
            char ch = (char)(i + 'a');
            numpad(processed + ch,unprocessed);
        }
    }
}
