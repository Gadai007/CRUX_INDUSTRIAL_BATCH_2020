package AssignmentRecursion2;

public class Question2 {
    public static void main(String[] args) {

        change("1234",0,0);
    }
    public static void change(String s, int index, int sum){
        if (index == s.length()){
            System.out.println(sum);
            return;
        }
        char ch = s.charAt(index);
        sum = (sum*10) + (ch - '0');
         change(s,index+1,sum);
    }
}
