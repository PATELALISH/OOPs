/**.
 * DATE :- 26th of June 2023
 */
public class Tesla extends Car{
    private boolean selfDrivingMode;

    //Constructor.
    public Tesla(String carModel, double mileage) {
        super(carModel, mileage);
        this.selfDrivingMode = false;
    }

    //Overridden getter.
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }



    //overridden setter. I made some change in it according Tesla.
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(Math.min(speed, 300));

        if(speed > 300){
           System.out.printf("This car can only go up to 300. Sorry!");
        }
    }

    //This method will turn on or turn off the self-driving mode.
    public String selfDrivingMode(boolean selfDrivingMode){
        if (selfDrivingMode){
            return "Self driving mode is on. Sit back and enjoy the ride!";
        } else return "Self driving mode is off";
    }

    @Override
    public void stop() {

        if(getSpeed() <= 20){
            System.out.println("The car is stopped");
         }
      else System.out.println("The car can't stop, it's too fast. The speed should be less then or equal 20!");

    }
}
