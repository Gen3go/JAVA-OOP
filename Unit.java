
public class Unit implements GameInterface{
    protected String name, usedItem;
    protected int health, speed;
    protected float inflictedIiron;
    protected int damage;
    protected int money;

    public Unit(String name, String usedItem, int health, int speed, float inflictedIiron, int damage, int money) {
        this.name = name;
        this.usedItem = usedItem;
        this.health = health;
        this.speed = speed;
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
    

}

