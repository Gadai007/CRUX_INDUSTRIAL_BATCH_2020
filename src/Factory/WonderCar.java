package Factory;

public class WonderCar extends Car {
    @Override
    public void start() {
        System.out.println("start like a wondercar");
    }

    @Override
    public void stop() {
        System.out.println("stop like a wondercar");
    }
}
