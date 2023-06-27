public class Hyundai extends Car implements Drive{
    private  boolean heatedSeat;


    public Hyundai(String carModel, double mileage) {
        super(carModel, mileage);
        this.heatedSeat = false;
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(Math.min(speed, 300));

        if(speed > 300){
            System.out.printf("This car can only go up to 180. Sorry!");
        }
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    public String heatedSeat(boolean heatedSeat){

        if (heatedSeat){
            this.heatedSeat = true;
            return "The front seat heating mode is on";
        } else return "the front seat heating mode is off";
    }
}
