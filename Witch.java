public class Witch extends Unit_robber_witch{
    Witch(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, float magic){
        super("name", "sorcerer's staff", 100, 100, 80, 50, 100, 100);
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
        " Скорость: " + speed + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Магия: " + magic;
    }

}
