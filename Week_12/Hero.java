public class Hero
{
    //Creating Variables For Heroes//
    
    public String name;
    public int PowerLevel;
    public HeroAffiliation affiliation;

    //Constructor For New Heroes//

    public Hero(String name, int PowerLevel, HeroAffiliation affiliation)
    {
        this.name = name;
        this.PowerLevel = PowerLevel;
        this.affiliation = affiliation;
    }

    //Various Getters//

    public String getName(){
        return name;
    }

    public int getPowerLevel(){
        return PowerLevel;
    }

    public HeroAffiliation getAffiliation() {
        return affiliation;
    }

    public String toString(){
        return "Name: " + name + "\nPowerLevel: " + PowerLevel + "\nAffiliation: " + affiliation;
    }
}