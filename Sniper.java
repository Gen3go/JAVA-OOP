import java.util.ArrayList;

public class Sniper extends Unit_sniper_cross_spearman{

    Sniper(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, int accuracy){
        super(team, "Aaron", "rifle", 100, 50, 50, 1, 100, 30);
    }

    @Override
    public String toString(){
        return "Снайпер";
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Меткость: " + accuracy;
    }

}
