package Lecture14;

public class QueueClient {
    public static void main(String[] args) {

        CircularQueue queue= new CircularQueue();

        for (int i = 0; i <9 ; i++) {
            queue.insert(i);
            queue.display();
        }
        for (int i = 0; i <9 ; i++) {
            queue.remove();
            queue.display();
        }
    }
}
