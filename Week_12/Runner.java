//Runner Class That Executes Program//
public class Runner
{
    public static void main(String [] args)
    {
        HeroManager manager = new HeroManager();

        //Creating Heroes//

        manager.addHero(new Hero("SpiderMan", 80, HeroAffiliation.AVENGERS));
        manager.addHero(new Hero("Wolverine", 85, HeroAffiliation.X_MEN));
        manager.addHero(new Hero("Mister Fantastic", 75, HeroAffiliation.FANTASTIC_FOUR));
        manager.addHero(new Hero("Superman", 95, HeroAffiliation.JUSTICE_LEAGUE));


        //Printing Hero List//

        System.out.println("Original List: ");
        manager.displayHeroes();

        
        //Sorting Hero List By Power Level Using Bubble Sort//

        System.out.println("\nBubble Sort by Power Level: ");
        manager.bubbleSortByPowerLevel();
        manager.displayHeroes();
         

        //Sorting Hero List By Power Level Using Insertion Sort//

        System.out.println("\nInsertion Sort by Power Level: ");
        manager.insertionSortByPowerLevel();
        manager.displayHeroes();
        

        //Displaying Hero List As A 2D Array//

        System.out.println("\nTwo-Dimensional Array Display: ");
        manager.displayHeroes2DArray();

        //Removing A Hero And Displaying Hero List After Removal//

        manager.removeHero("Mister Fantastic");
        System.out.println("\nList after removing Mister Fantastic: ");
        manager.displayHeroes();

        //Adding A New Hero And Displaying Hero List After Adding//

        manager.addHero(new Hero("Iron Man", 82, HeroAffiliation.AVENGERS));
        System.out.println("\nList after adding Iron Man: ");
        manager.displayHeroes();
    }
    
}