package Lecture14;

public class OptimizedQueue {
    private int DEFAULT_SIZE = 10;

    private int end;

    private int front;

    private int[] ar;

    public OptimizedQueue(){
        this.ar = new int[DEFAULT_SIZE];
        this.end = 0;
        this.front =0;
    }
    public boolean isFull(){
        return end == ar.length;
    }
    public void insert(int element){
        if (isFull()){
            return;
        }
        ar[end++] = element;
    }
    public boolean isEmpty(){
        return  end ==0;
    }
    public int remove(){
        if (isEmpty()) {
            return -1;
        }
        int temp = ar[0];

        front++;
        return temp;
    }
    public void display(){
        for (int i = front; i <end ; i++) {
            System.out.print(ar[i]);
        }
        System.out.println();
    }
    public int front(){
        return ar[0];
    }
}
