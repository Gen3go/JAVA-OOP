import java.util.ArrayList;

public class Peasant extends Unit_peasant_monk {


    Peasant(ArrayList<Unit> team, String name, String usedItem, int health, int money, int intiative, float inflictedIiron, int damage, float thePowerOfTheEarth, int powerOfKind){

        super(team, name, usedItem, health, money, intiative, inflictedIiron, damage, thePowerOfTheEarth, powerOfKind);
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
        return name + " Иван " + " Здоровье: "+ health +
        " Деньги: " + money + "Сила земли: " + thePowerOfTheEarth;
    }

    

}
