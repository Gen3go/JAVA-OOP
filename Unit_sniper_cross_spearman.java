import java.util.ArrayList;

public class Unit_sniper_cross_spearman extends Unit {

        protected int accuracy;
    
        public Unit_sniper_cross_spearman(ArrayList<Unit> team, String name, String usedItem, int health, int intiative, float inflictedIiron, int damage, int money, int accuracy) {
            super(team, name, usedItem, health, intiative, inflictedIiron, damage, money);
            this.accuracy = accuracy;
    
        }

        void restoreHealthFromMoney(){

        }
        void superVision(){

        }
}
