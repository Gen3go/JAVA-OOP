import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Unit implements GameInterface, Comparable{
    protected String name, usedItem;
    protected int health, maxHealth, intiative;
    protected float inflictedIiron;
    protected int damage;
    protected int money;

    public Unit(ArrayList<Unit> team, String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money) {
        this.team = team;
        this.name = name;
        this.usedItem = usedItem;
        this.health = health;
        this.maxHealth = health;
        if(new Random().nextBoolean()) this.health-=9;
        this.intiative = intiative;
        this.inflictedIiron = inflictedIiron;
        this.damage = damage;
        this.money = money;

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

