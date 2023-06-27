/**
 * Tesla class is child class of Car class.
 * This class contains Tesla's own features, that make it different from other cars.
 * Like self-driving mode, own highest speed, own mileage.
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

    //overridden setter. I make some change in it according Tesla.
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(Math.min(speed, 300));

        if(speed > 300){
           System.out.printf("This car can only go up to 300. Sorry!");
        }
    }

    //Tesla has its own feature unlike other cars.
    public String selfDrivingMode(boolean selfDrivingMode){
        if (selfDrivingMode){
            return "Self driving mode is on. Sit back and enjoy the ride!";
        } else return "Self driving mode is off";
    }
}
