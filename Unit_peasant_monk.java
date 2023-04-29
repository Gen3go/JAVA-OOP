import java.util.ArrayList;

public class Unit_peasant_monk extends Unit{

    protected float thePowerOfTheEarth;
    protected int powerOfKind;


    public Unit_peasant_monk(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind) {
        super(team, name, usedItem, health, intiative, inflictedIiron, damage, money);
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