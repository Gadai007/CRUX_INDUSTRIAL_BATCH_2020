package Factory;

public class Audi extends Car {
    @Override
    public void start() {
        System.out.println("start like a audi");
    }

    @Override
    public void stop() {
        System.out.println("stop like a audi");
    }
}
