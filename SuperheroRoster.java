public class SuperheroRoster
{
    public static void main(String [] args)
    {
        Hero[] heroes = {
            new Hero("Cyclops","Lasers",85), 
            new Hero("Storm","Lightning",90), 
            new Hero("Sentinel","Missiles and drones",80)};


        System.out.println("\nDisplaying Heroes using the Hero class: \n");    


        for(Hero he: heroes)
        {
            System.out.println(he);
        }

        displayHero(heroes,"Dr Doom");

    
        
        String[] heroNames = {"Cyclops", "Storm", "Sentinel"};
        String[] heroAbilities = {"Lasers", "Lightning", "Missiles and drones"};
        int[] powerLevels = {85,90,80};
        

        for(int i = 0; i<heroNames.length; i++)
        {
            System.out.println("Hero " + (i+1) + " Name: " + heroNames[i]);
            System.out.println("Hero " + (i+1) + " Abilities: " + heroAbilities[i]);
            System.out.println("Hero " + (i+1) + " Power Level:" + powerLevels[i]);
        }

        searchHero(heroNames, heroAbilities, powerLevels, "Cyclops");

        double averagePowerLevel = calculateAveragePower(powerLevels);
        System.out.println("Average power level of heroes is: " + averagePowerLevel);

       

        
        

    }

    public static void searchHero(String[] heroNames, String[] heroAbilities, int[] powerLevels, String target)
    {
        for(int i = 0; i < heroNames.length; i++)
        {
            if(heroNames[i].equalsIgnoreCase(target))
            {
                System.out.println("Hero found: ");
                System.out.println("Name: " + heroNames[i]);
                System.out.println("Abilities: " + heroAbilities[i]);
                System.out.println("Power level: " + powerLevels[i]);
                return;
            }
        }
        System.out.println("Hero not found.");

        
    }

    public static void displayHero(Hero[] he, String target)
    {
        for(int i = 0; i<he.length;i++)
        {
            if(he[i].getName().equalsIgnoreCase(target))
            {
                System.out.println("Hero Found!: \n");
                System.out.println(he[i]);
            }
        }
        System.out.println(target + "Not found. \n");
    }

    
    public static double calculateAveragePower(int[] powerLevels)
    {
        int sum = 0;
        for(int level : powerLevels)
        {
            sum += level;
        }
        return (double) sum / powerLevels.length;
    }
        
        

}
