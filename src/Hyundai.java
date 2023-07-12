/**.
 * DATE :- 26th of June 2023
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
            System.out.println("This car can only go up to 300. Sorry!");
        }
    }

    //Overridden setter.
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void stop() {
        if(getSpeed() <= 15){
            System.out.println("The car is stopped");
         }
      else System.out.println("The car can't stop, it's too fast. The speed should be less then or equal 15!");
    }

    //This method will heat up the seat.
    public String heatedSeat(boolean heatedSeat){

        if (heatedSeat){
            this.heatedSeat = true;
            return "The front seat heating mode is on";
        } else return "the front seat heating mode is off";
    }
}
