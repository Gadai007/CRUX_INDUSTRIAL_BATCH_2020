package Lecture17_Development;

public class SingletonClient {
    public static void main(String[] args) {

        Singleton object = Singleton.getInstance();

        object.increment();
        object.increment();
        object.increment();

        System.out.println(object.getCounter());

        Singleton object2 = Singleton.getInstance();

        object2.increment();
        object2.increment();
        object2.increment();

        System.out.println(object2.getCounter());
    }
}
