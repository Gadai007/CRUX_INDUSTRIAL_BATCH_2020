package AssignmentRecursion;

public class Question1 {
    public static void main(String[] args) {
        print(5,0);
    }
    public static void print(int n,int index){ //5 3 1 2 4 6
        if (index == n){
            return;
        }
        if (n % 2 != 0){
            System.out.println(n);
        }
        print(n-1,index);
        if (n % 2 == 0){
            System.out.println(n);
        }
    }
}

