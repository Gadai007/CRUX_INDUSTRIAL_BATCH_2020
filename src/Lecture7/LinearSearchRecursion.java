package Lecture7;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
        System.out.println(search(ar,5,0));
        System.out.println(sorted(ar,0));
    }
    public static int search(int ar[],int element, int index){
        if (index == ar.length){
            return  -1;
        }
        if (ar[index] == element){
            return index;
        }
        return search(ar, element, index+1);
    }
    public static boolean sorted(int ar[],int index){
        if (index == ar.length-1)
            return true;

        if (ar[index] > ar[index+1]){
            return false;
        }
        return sorted(ar,index+1);
    }

}
