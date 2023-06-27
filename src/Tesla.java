public class Tesla extends Car implements Drive{
    private boolean selfDrivingMode;

    public Tesla(String carModel, double mileage) {
        super(carModel, mileage);
        this.selfDrivingMode = false;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(Math.min(speed, 300));

        if(speed > 300){
           System.out.printf("This car can only go up to 300. Sorry!");
        }
    }

    public String selfDrivingMode(boolean selfDrivingMode){
        if (selfDrivingMode){
            return "Self driving mode is on. Sit back and enjoy the ride!";
        } else return "Self driving mode is off";
    }
}
