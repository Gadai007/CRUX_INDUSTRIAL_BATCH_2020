package Lecture16;

public class ArrayList {
    private int DEFAULT_SIZE = 10;

    private int[] data;

    private int size;

    public ArrayList(){
        this.data = new int[DEFAULT_SIZE];
        this.size = 0;
    }
    public void add(int element){
        if(isFull()){
            resize();
        }

        data[size++] = element;
    }

    private void resize() {
         int ar[] = new int[2*data.length];
         for (int i = 0; i < data.length ; i++) {
            ar[i] = data[i];
        }
         data= ar; //  changes the reference from data array to new array.
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }
    public void set(int index, int element){
      data[index] = element;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
}
