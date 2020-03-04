package Lecture6;

public class StringCompression {
    public static void main(String[] args) {
        compression("aaabbccaa");
    }
    public static String compression(String s) {
        StringBuilder b = new StringBuilder();
        char ch = s.charAt(0);
        b.append(ch);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (ch == s.charAt(i)) {
                count++;
            } else {
                ch = s.charAt(i);
                b.append(("" + count) + (char) ch);
                count = 1;
            }

        }
        b.append(count);
        return b.toString();
    }
}
