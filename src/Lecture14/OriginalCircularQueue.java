package Lecture14;

public class OriginalCircularQueue {
    private int DEFAULT_SIZE = 10;

    private int end;

    private int front;

    private int[] ar;

    private int size;

    public OriginalCircularQueue(){
        this.ar = new int[DEFAULT_SIZE];
        this.end = 0;
        this.front =0;
        this.size = 0;
    }
    public boolean isFull(){
        return size == ar.length;
    }
    public void insert(int element){
        if (isFull()){
            return;
        }
        ar[end++] = element;
        end = end % ar.length;
        size++;
        return;
    }
    public boolean isEmpty(){
        return  size ==0;
    }
    public int remove(){
        if (isEmpty()) {
            return -1;
        }
        int temp = ar[front];
        front = front % ar.length;
        size--;
        front++;
        return temp;
    }
    public void display(){
        for (int i = 0; i <size; i++) {
            System.out.print(ar[(front + i)%ar.length] + " ");
        }
        System.out.println();
    }
    public int front(){
        return ar[0];
    }
}
