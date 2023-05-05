import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Unit implements GameInterface, Comparable{
    protected String name, usedItem;
    protected int health, maxHealth, intiative;
    protected static float inflictedIiron;
    protected static int damage;
    protected int money;
    protected Coordinates coordinates;

    public Unit(ArrayList<Unit> team, float x, float y) {
        this.team = team;
        this.name = name;
        this.usedItem = usedItem;
        this.health = health;
        this.maxHealth = health;
        if(new Random().nextBoolean()) this.health-=9;
        this.intiative = intiative;
        this.inflictedIiron = inflictedIiron;
        this.damage = (int) inflictedIiron;
        this.money = money;
        this.coordinates = new Coordinates(x, y);

    }


    void attack(){

    }

    @Override
    public int getHealth() {
        return health;
    }


    @Override
    public String getInfo() {

        return null;
    }

    @Override
    public void step() {

        
    }
    
    protected ArrayList<Unit> team;

    @Override
    public int compareTo(Object o){
        Unit unit = (Unit) o;
        return this.intiative - unit.intiative;
    }

}

