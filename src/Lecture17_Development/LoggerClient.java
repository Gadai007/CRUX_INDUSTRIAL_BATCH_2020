package Lecture17_Development;

public class LoggerClient {
    public static void main(String[] args) {
        Logger object = Logger.getInstance();
        object.log("ye pehla clas ka he");
        Logger2Client object2 = new Logger2Client();
        object2.doSomething();


    }
}
