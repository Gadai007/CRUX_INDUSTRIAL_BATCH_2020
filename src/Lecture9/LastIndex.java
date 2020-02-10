package Lecture9;

public class LastIndex {
    public static void main(String[] args) {
        int[] ar = {1,2,3,3,4,5};
        index(ar,5,3);
    }
    public static void index(int ar[], int index, int element){
        if (ar[index] == element ){
            System.out.println(index);
            return;
        }

        index(ar,index-1,element);
    }
}
