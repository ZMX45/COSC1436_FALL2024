//Inheriting From Vehicle Class//
public class Bicycle extends Vehicle{
    
    private boolean hasBell;

    //Bicycle Constructor that Inherits From Vehicle//
    public Bicycle(int speed, double fuel, boolean hasBell){
        super(speed, fuel);
        this.hasBell = hasBell;
    }
    
    //Overriding Start method to behave accordingly for Bicycle objects//
    @Override
    public void Start(){
        System.out.println("Pedal Away!");
    }


    public void ringBell(){
        if(hasBell = true){
            System.out.println("Ding Ding");
        }
        else if(hasBell = false){
            System.out.println("The bicycle does not have a bell.");
        }
    }

    public void setHasBell(boolean hasBell){
        this.hasBell = hasBell;
    }

    public boolean getHasBell(){
        if(hasBell = true){
            System.out.println("\nThe bicycle has a bell.");
        }
        else{
            System.out.println("\nThis bicycle does not have a bell");
        }
        return hasBell;
    }

}