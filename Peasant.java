import java.util.ArrayList;

public class Peasant extends Unit_peasant_monk {


    Peasant(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind){

        super(team, "Grigorii", "hoe", 10, 10, 5, 10, 1, 10, 0);
    }

    @Override
    public String toString(){
        return "Крестьянин";
    }

    @Override
    public int getHealth(){
        return health;
        
    }

    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Сила земли: " + thePowerOfTheEarth;
    }

    

}
