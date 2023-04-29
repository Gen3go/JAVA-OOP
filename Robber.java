import java.util.ArrayList;

class Robber extends Unit_robber_witch{

    Robber(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, float magic){
        super(team, "Avile", "knife", 100, 50, 70, 2, 100, 0);
    }
    void stealThings(){

    }
    void payThing(){

    }
    
    @Override
    public String toString(){
        return "Разбойник";
    }
    
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + intiative + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + money;
    }

}