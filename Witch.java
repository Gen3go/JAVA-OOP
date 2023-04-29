import java.util.ArrayList;

public class Witch extends Unit_robber_witch{
    Witch(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, float magic){
        super(team, "Gandalf", "sorcerer's staff", 100, 100, 80, 50, 100, 100);
    }
    
    @Override
    public String toString(){
        return "Колдун";
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + money + " Магия: " + magic;
    }

    

}
