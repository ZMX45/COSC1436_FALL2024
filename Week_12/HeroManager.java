//Importing The Necessary Java Tools//

import java.util.ArrayList;
import java.util.Arrays;
public class HeroManager{
    public ArrayList<Hero> heroes = new ArrayList<Hero>();


    //Methods For Adding And Removing Heroes From List//
    public void addHero(Hero hero){
        heroes.add(hero);
    }

    public void removeHero(String name){
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    //Bubble Sorting Method For Power Levels//

    public void bubbleSortByPowerLevel()
    {
        for (int i = 0; i < heroes.size() - 1; i++){
            for (int j = 0; j < heroes.size() - i - 1; j++){
                if(heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()){
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }

            }
        }

    }

    //Insertion Sorting Method For Power Levels//

    public void insertionSortByPowerLevel(){
        for(int i = 1; i < heroes.size(); i++){
            Hero key = heroes.get(i);
            int j = i - 1;

            while(j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()){
                heroes.set(j + 1 , heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    //Method For Displaying Hero List As A 2D Array//
    
    public void displayHeroes2DArray(){
        String [][] heroArray = new String[heroes.size()][3];

        for(int i = 0; i < heroes.size(); i++){
            heroArray[i][0] = heroes.get(i).getName();
            heroArray[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            heroArray[i][2] = heroes.get(i).getAffiliation().toString();
        }

        System.out.println(Arrays.deepToString(heroArray));
    }
    
    //Method For Printing Out Hero List//

    public void displayHeroes(){
        for(int i = 0; i < heroes.size(); i++){
            System.out.println(heroes.get(i));
        }
    }
}