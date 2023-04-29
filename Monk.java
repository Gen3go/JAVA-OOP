import java.util.ArrayList;

public class Monk extends Unit_peasant_monk {


    public static char[] getInfo;

    Monk(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind){

        super(team, "Neof", "snag", 100, 10, 5, 1, 100, 10, 10);

    }

    void takePowerOfKind(){

    }

    @Override
    public String toString(){
        return "Монах";
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: "  + " Сила доброты: " + powerOfKind;
    }

    

}
