

public class Peasant extends Unit_peasant_monk {


    Peasant(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind){

        super("Grigorii", usedItem, health, speed, inflictedIiron, damage, money, thePowerOfTheEarth, powerOfKind);
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
        " Скорость: " + speed + " Наносимый урон: " + inflictedIiron + 
        " Урон: " + damage + " Деньги: " + " Сила земли: " + thePowerOfTheEarth + 
        " Сила доброты: " + powerOfKind;
    }

    

}
