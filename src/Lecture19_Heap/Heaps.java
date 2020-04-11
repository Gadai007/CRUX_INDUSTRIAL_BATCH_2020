package Lecture19_Heap;

import java.util.ArrayList;



public class Heaps {

    ArrayList<Integer> list = new ArrayList();


    public int parent(int index){ //here "index" refers to the index of itself.
        return (index - 1)/2;
    }

    public int leftchild(int index){  //here "index" refers to the index of the parent.
        return (2*index)+1;
    }

    public int rightchild(int index){ //here "index" refers to the index of the parent.
        return (2*index)+2;
    }

    public void display(){
        System.out.println(list);
    }

    public void add(int element){
        list.add(element);
        upheap(list.size()-1);
    }

    private void upheap(int index) {
        if(index == 0){
            return;
        }

        int p = parent(index);

        if(list.get(index) > list.get(p)){
            swap(p,index);
            upheap(index);    //upheap is used to add element because last element is always
        }                     //larger element in case of min heap.
    }

    public int remove() throws Exception {
        if (list.isEmpty()){
            throw new Exception("Khali he bhai");
        }

        int temp = list.get(0);
        int last = list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {

        int min = index;

        int left = leftchild(index);
        int right = rightchild(index);

        if(left < list.size() && list.get(min) > list.get(left)){
            min = left;
        }

        if (right <list.size() && list.get(min) > list.get(right)){
            min = right;
        }

        if(index != min){
            swap(min,index);
            downheap(min);
        }
    }

    private void swap(int p, int index){

        int temp = list.get(p);
        list.set(p,list.get(index));
        list.set(index,temp);

    }

}
