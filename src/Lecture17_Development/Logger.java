package Lecture17_Development;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Logger {
    private static Logger instances;

    private PrintStream out;

    private Logger(){
        File f = new File("log.txt");

        try {
            this.out = new PrintStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        if(Logger.instances == null){
            Logger.instances = new Logger();
        }
        return Logger.instances;
    }

    public void log(String text){
        this.out.println(text);
    }

}
