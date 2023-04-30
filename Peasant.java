import java.util.ArrayList;

public class Peasant extends Unit_peasant_monk {


    Peasant(ArrayList<Unit> team, String name, int health, int money){

        super(team, name, health, money);
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
