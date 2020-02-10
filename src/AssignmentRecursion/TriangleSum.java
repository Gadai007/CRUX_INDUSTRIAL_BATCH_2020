package AssignmentRecursion;

public class TriangleSum {
    public static void main(String[] args) {
        add(4,0);
        add1(4,0,1);
    }
    public static void add(int n,int sum){
        if (n==0){
            System.out.println(sum);
            return;
        }
        for (int i = 0; i <=n ; i++) {
            sum = sum + i;
        }

        add(n-n,sum);
    }
    public static void add1(int n,int sum, int index){
        if (n < index){
            System.out.println(sum);
            return;
        }
        if (n >= index){
            sum = sum + index;
        }

        add1(n,sum,index+1);
    }
}
