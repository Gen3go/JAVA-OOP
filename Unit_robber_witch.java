import java.util.ArrayList;

public class Unit_robber_witch extends Unit {

    protected float magic;

    Unit_robber_witch(ArrayList<Unit> team, float x, float y){
        super(team, name, usedItem, health, intiative, inflictedIiron, damage, money, x, y);
        this.magic = magic;
    }

    
    void disappearIntoTheCrowd(){

    }

    @Override
    public void step() {
        int index_damaged = 0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i+1; j < team.size()-1; j++) {
                if(team.get(i).health/team.get(i).maxHealth < team.get(j).health/team.get(j).maxHealth){
                    index_damaged = i;
                }
            }
        }
        
    }

}
