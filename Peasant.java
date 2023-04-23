

public class Peasant extends Unit_peasant_monk {


    Peasant(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind){

        super(name, "hoe", 100, 10, 10, 1, 100, 10, 0);
    }

    @Override
    public String toString(){
        return name;
    }
}
