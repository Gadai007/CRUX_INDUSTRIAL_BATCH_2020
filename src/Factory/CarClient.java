package Factory;

import java.util.Scanner;

public class CarClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String carName = s.nextLine();
        Car mycar = CarFactory.getCar(carName);
        if(mycar == null){
            System.out.println("car not found");
        }
        else{
            mycar.start();
            mycar.stop();
        }
    }
}
