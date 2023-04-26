public class Sniper extends Unit_sniper_cross_spearman{

    Sniper(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, int accuracy){
        super("name", "rifle", 100, 50, 50, 1, 100, 30);
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
        " Скорость: " + speed + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Меткость: " + accuracy;
    }

}
