package AssignmentRecursion2;

public class Question1 {
    public static void main(String[] args) { //  Take as input str, a number in form of a string. Write a recursive function to find the sum of digits in the string. Print the value returned.
        add("1234",0,0);
    }
    public static void add(String s,int index, int sum){
        if (index == s.length()){
            System.out.println(sum);
            return;
        }
        String k = s.substring(index, index+1);
        int j = Integer.parseInt(k);
        sum = sum + j;
        add(s,index+1,sum);
    }
}
