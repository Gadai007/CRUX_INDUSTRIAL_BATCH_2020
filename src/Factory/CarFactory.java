package Factory;

public class CarFactory {

    public static  Car getCar(int cal){
        if (cal < 5){
            return new Maurti();
        }
        else if (cal < 10){
            return new Audi();
        }
        else {
            return new WonderCar();
        }
    }
    public static  Car getCar(String cal){
        if (cal.equals("maurti")){
            return new Maurti();
        }
        else if (cal.equals("Audi")){
            return new Audi();
        }
        else if(cal.equals("Wonder Car")){
            return new WonderCar();
        }
        else {
            return null;
        }
    }
}
