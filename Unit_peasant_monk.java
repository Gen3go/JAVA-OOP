import java.util.ArrayList;

public class Unit_peasant_monk extends Unit{

    protected static float thePowerOfTheEarth;
    protected int powerOfKind;


    public Unit_peasant_monk(ArrayList<Unit> team, String name, String usedItem, int health, int money, int intiative, float inflictedIiron, int damage, float thePowerOfTheEarth, int powerOfKind) {
        super(team, name, usedItem, health, money, intiative, inflictedIiron, damage);
        this.thePowerOfTheEarth = thePowerOfTheEarth;
        this.powerOfKind = powerOfKind;

    }


    void restoreHealthFromTheEarthPower(){

    }
    void takeThePowerOfTheEarth(){

    }
    void giveHearth(){

    }
}