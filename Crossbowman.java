public class Crossbowman extends Unit_sniper_cross_spearman{
    Crossbowman(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, int accuracy){
        super("name", "crossbow", 100, 40, 40, 1, 100, 20);
    }

    @Override
    public String toString(){
        return "Арбалетчик";

    }

    @Override
    public String getInfo() {
        return name + " Используемый предмет: " + " Здоровье: "+ health +
        " Скорость: " + speed + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Магия: " + accuracy;
    }


}
