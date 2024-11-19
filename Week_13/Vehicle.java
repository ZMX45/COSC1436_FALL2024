public class Vehicle{
    //Creating Variables For Vehicle Objects//
    protected int speed;
    private double fuel;

    //Vehicle Constructor//
    public Vehicle(int speed, double fuel){
        this.speed = speed;
        this.fuel = fuel;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public int getSpeed(){
        System.out.println("\nThe speed is " + speed);
        return speed;
    }
    public double getFuel(){
        System.out.println("\nThe fuel rating is " + fuel);
        return fuel;
    }

    //Creating Methods That are later used by Vehicle Objects//
    public void Start(){
        System.out.println("The vehicle has started.");
    }
    public void Stop(){
        System.out.println("The vehicle has stopped");
    }
    //Making displayFuel method FINAL so it cannot be altered in subclasses//
    public final void displayFuel(){
        System.out.println("The fuel level is " + fuel);
    }
}