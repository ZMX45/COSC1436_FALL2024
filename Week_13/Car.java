//Inheriting From Vehicle class//
public class Car extends Vehicle{
    
    private int numberOfDoors;

    //Car Constructor that Inherits 2 of its variable from the Vehicle Contstructor//
    public Car(int speed, double fuel, int numberOfDoors){
        super(speed, fuel);
        this.numberOfDoors = numberOfDoors;
    }

    //Overriding the Start method so it can function differently for Car//
    @Override
    public void Start(){
        System.out.println("The car has started.");
    }

    public void Honk(){
        System.out.println("Beep Beep.");
    }

    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors(){
        System.out.println("\nThe car has " + numberOfDoors + " doors.");
        return numberOfDoors;
    }


}
