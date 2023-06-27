/**
 * In this Main class, include main method.
 * The commented code is the test for individual class.
 */

public class Main {
    public static void main(String[] args) {
//        Tesla tesla = new Tesla("Tesla S model", 310000);
//        tesla.setSpeed(250);
//        System.out.println(tesla.getSpeed());
//        tesla.setSpeed(255);
//        System.out.println(tesla.getSpeed());
//          tesla.turnOn();
//          tesla.turnOn();
//        System.out.println(tesla.selfDrivingMode(true));
//       // System.out.println(tesla.increaseSpeed(300));
//        System.out.println(tesla.decreaseSpeed(50));

//        Car car = new Car("Nisan", 30000);
//
//        //car.turnOn();
//        System.out.println(car.increaseSpeed(20));

        Hyundai hyundai = new Hyundai("hyundai", 30000);
        hyundai.turnOn();
        hyundai.setSpeed(30);
        System.out.println(hyundai.getSpeed());
        hyundai.setSpeed(40);
        System.out.println(hyundai.getSpeed());
        System.out.println(hyundai.increaseSpeed(10));
        hyundai.stop();
        System.out.println(hyundai.heatedSeat(false));


    }
}
