
public class Hero
{
     String name;
     String ability;
     int powerLevel;

    public Hero(String name,String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
        
    }

    

    public int getPowerLevel()
    {
        return powerLevel;
    }

    public String getName(){
        return name;
    }

    public String toString()
    {
        return "Name: " + name + "\n" + "Ability: " + ability + "\n" + "Power level: " + powerLevel +"\n";
    }


    
}
