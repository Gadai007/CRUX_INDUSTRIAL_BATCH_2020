package Lecture16;

public class LinkedList {

    private Node head;

    private Node tail;

    private int size = 0;

    public void insertfirst(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    protected class Node{

        int value;
        Node next; // Stores the node type values and stores the value of next node.

        public Node(int value){
            this.value = value;
        }

    }

    public void insertatlast(int value){
        if (size == 0){
            insertfirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteatfirst(){
        if (size == 0){
            return  -1;
        }
        int value = head.value;

        head = head.next;
        size--;
        return value;
    }

    public int deleteLast(){
        if (size < 2){
           return deleteatfirst();
        }

        Node temp = head;
         while (temp.next != tail){

             temp = temp.next;
         }
         int value = temp.next.value;
         temp.next = null;
         tail = temp;
         size--;
         return value;
    }


}
