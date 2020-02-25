package Lecture16;

public class LinkedListClient {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
//        for (int i = 0; i <15 ; i++) {
//            list.insertfirst(i);
//            list.display();
//        }
        list.insertatlast(1);
        list.insertatlast(2);
        list.insertatlast(3);
        list.insertatlast(4);
        list.display();

        System.out.println(list.deleteatfirst());
        System.out.println(list.deleteLast());
        list.display();


    }
}
