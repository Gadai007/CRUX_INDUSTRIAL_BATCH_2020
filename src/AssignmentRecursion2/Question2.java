package AssignmentRecursion2;

public class Question2 {
    public static void main(String[] args) {
        change("1234",0,0);
    }
    public static int change(String s, int index, int sum){
        if (index == s.length()){
            return sum;
        }
        char ch = s.charAt(index);
        int rem = ch - '0';
        sum = (sum*10) + rem;
        return change(s,index+1,sum);
    }
}
