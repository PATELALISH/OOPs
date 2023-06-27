/**
 * Hyundai class is child class of Car class.
 * This class contains Hyundai's own features, that make it different from other cars.
 * Like heating up the seat, own highest speed, own mileage.
 */
public class Hyundai extends Car {
    private  boolean heatedSeat;


    //Constructor
    public Hyundai(String carModel, double mileage) {
        super(carModel, mileage);
        this.heatedSeat = false;
    }

    //Overridden setter. I make some changes according to Hyundai.
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(Math.min(speed, 300));

        if(speed > 300){
            System.out.printf("This car can only go up to 180. Sorry!");
        }
    }

    //Overridden setter.
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    //Hyundai has some feature unlike other car.
    public String heatedSeat(boolean heatedSeat){

        if (heatedSeat){
            this.heatedSeat = true;
            return "The front seat heating mode is on";
        } else return "the front seat heating mode is off";
    }
}
