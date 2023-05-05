import java.util.ArrayList;

public class Peasant extends Unit_peasant_monk {


    Peasant(ArrayList<Unit> team, String name, float x, flout y ){

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
