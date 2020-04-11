package Lecture17_Development;

public class Singleton {

    private static Singleton instance;

    private int counter =0;

    private Singleton(){

    }
    public void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public static Singleton getInstance(){
        if (Singleton.instance == null){
            Singleton.instance = new Singleton();
        }

        return Singleton.instance;
    }
}
