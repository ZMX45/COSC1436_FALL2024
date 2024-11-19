public class Main{
    
    public static void main(String [] args){

        //Consrtructing Car and Bicycle Objects//

        Car car1 = new Car(60,30,4);
        Bicycle bike1 = new Bicycle(20,0,true);
        Car car2 = new Car(120,20,2);
        Bicycle bike2 = new Bicycle(30,0,false);

        //Calling the Relevant Methods for Car and Bicycle Respectively//

        car1.Start();
        car1.displayFuel();
        car1.Honk();

        System.out.println();

        bike1.Start();
        bike1.displayFuel();
        bike1.ringBell();

        car1.getFuel();

        System.out.println();

        car2.Start();
        car2.displayFuel();
        car2.Honk();

        //Changing and Displaying a New Value for a Variable of Car//

        car2.setFuel(50.5);

        car2.displayFuel();

        System.out.println();

        bike2.Start();
        bike2.displayFuel();






    }
}