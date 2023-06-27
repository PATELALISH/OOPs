/**
 *
 */

public class Car implements Drive{
    /**
     *
     **/

    private String carModel;
    private double mileage;
    private int speed;

    private boolean driving;



    public Car(String carModel, double mileage) {
        this.carModel = carModel;
        this.mileage = mileage;
        this.speed = 0;
        this.driving = false;

    }


    public void setSpeed(int speed) {
        if (this.speed == 0) {
            this.driving = true;
            this.speed = speed;
        }
        else System.out.println("The speed is already set!");
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isDriving(){
        return driving;
    }



    public void turnOn() {
        if (!this.driving || speed == 0){
            this.driving =true;
            System.out.println("The car is ready to go");
        } else {
            System.out.println("The car is already in motion!");
        }
    }

    public int increaseSpeed(int addSpeed) {
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
        return this.speed = Math.min(getSpeed() - speed, this.speed);
    }


    public void stop() {
//        if(this.speed > 20){
            System.out.println("The car is stopped");
//        }
//      else System.out.println("The car can't stop, it's too fast. The speed should be less then 20!");

    }
}

