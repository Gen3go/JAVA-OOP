public class Unit_peasant_monk extends Unit{

    protected float thePowerOfTheEarth;
    protected int powerOfKind;


    public Unit_peasant_monk(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money, float thePowerOfTheEarth, int powerOfKind) {
        super(name, usedItem, health, speed, inflictedIiron, damage, money);
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