package Lecture7;

public class Builder {
    public static void main(String[] args) {//

//        String s = "";
//
//        StringBuilder builder = new StringBuilder(s);
//
//        for (int i = 0; i <10000 ; i++) {
//            builder.append('a');
//        }
//        System.out.println(builder);
        System.out.println(change("aBCde"));
    }
    public static StringBuilder change(String str){ //change uppercase to lowercase and vice verse.
//        StringBuilder b = new StringBuilder(str);
        StringBuilder b = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
             char ch = str.charAt(i);
             if (ch >= 'A' && ch <= 'Z'){
                  ch = (char)('a' + (ch - 'A'));
             }
              else {
                  ch = (char)('A' + (ch - 'a'));
             }
              b.append(ch);
//            b.setCharAt(i,ch);
        }

        return b;
    }
}
