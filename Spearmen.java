public class Spearmen extends Unit_sniper_cross_spearman{
    Spearmen(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, int accuracy){
        super("name", "spear", 100, 30, 50, 1, 100, 10);
    }

    void restoreSpearFromMoney(){
        
    }

    @Override
    public String toString(){
        return "Копейщик";
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
