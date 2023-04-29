import java.util.ArrayList;

public class Crossbowman extends Unit_sniper_cross_spearman{
    Crossbowman(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, int accuracy){
        super(team, "Gilligan", "crossbow", 100, 40, 40, 1, 100, 20);
    }

    @Override
    public String toString(){
        return "Арбалетчик";

    }
    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Магия: " + accuracy;
    }
}
