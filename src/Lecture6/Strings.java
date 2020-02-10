package Lecture6;

public class Strings {
    public static void main(String[] args) {

        String s = "hello"; //string is a class in java.
        System.out.println(s);

        String p = new String("Hello");
        System.out.println(s.equals(p)); //it compares the values of the object.
        System.out.println(s == p);// it compares the whole object.

        System.out.println(s.substring(1));//it gives the values according to the given index.Excluding the mentioned value.
        System.out.println(s.substring(1, 3));
        System.out.println(s.charAt(0));//it gives the value present in that index.
        System.out.println(s.indexOf("h"));// finds out the value is present or not.
       find("hello","l");
        substring(s);
       palindrome(s);



    }
    public static void find(String str, String pattern){ // Find the number of string occurred.
        int index = 0;

        while (true){

            index = str.indexOf(pattern,index);
            if(index == -1){
                break;
            }
            System.out.println(index);
            index=index + 1;
        }
    }
    public static void substring(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
    public static void palindrome(String str){
        int start = 0;
        int end= str.length()-1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end)){
                System.out.println("Not Palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Palindrome");
    }
}
