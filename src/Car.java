/**
 * contains the method for car functions such as turn on, setting up the speed, increase the speed, decrease the speed,
 * and stop.
 * @WrittenBy ALISH PATEL.
 * Date 26th of June 2023.
 */

public class Car implements Drive{


    private String carModel;
    private double mileage;
    private int speed;
    private boolean driving;


    //constructor
    public Car(String carModel, double mileage) {
        this.carModel = carModel;
        this.mileage = mileage;
        this.speed = 0;
        this.driving = false;

    }


    //setter
    public void setSpeed(int speed) {
        if (this.speed == 0) {
            this.driving = true;
            this.speed = speed;
        }
        else System.out.println("The speed is already set!");
    }

    //getter
    public int getSpeed() {
        /**
         * NOTE :- after setting up the speed for the first time. You have to use increaseSpeed() method to increase
         * the speed
         * in motion. Otherwise the speed will not increase.
         **/
        return this.speed;
    }

    public boolean isDriving(){
        return driving;
    }



    //This method will turn On the car.
    public void turnOn() {
        if (!this.driving || speed == 0){
            this.driving =true;
            System.out.println("The car is ready to go");
        } else {
            System.out.println("The car is already in motion!");
        }
    }

    //this method will increase the speed of the car.
    public int increaseSpeed(int addSpeed) {
        /**
         * Use this method to ONLY increase the speed.
         */
        if(getSpeed() + addSpeed >= 300){
            System.out.println("Those car can go up to 300");
        }
        if(this.driving) return this.speed = Math.max(getSpeed() + addSpeed, this.speed);
        else {
            System.out.println("The car is not turned on yet!");
            return this.speed;
        }
    }


    public int decreaseSpeed(int speed) {
        /**
         * Use this method to ONLY decrease the speed.
         */
        return this.speed = Math.min(getSpeed() - speed, this.speed);
    }


    public void stop() {
        /**
         * UPDATE :- I update this method. Firstly the car can stop at any speed.
         * But now it can only stop at certain speed.
         */
         if(this.speed <= 20){
            System.out.println("The car is stopped");
         }
      else System.out.println("The car can't stop, it's too fast. The speed should be less then or equal 20!");

    }
}

