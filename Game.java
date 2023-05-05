import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class Game {


    public static void main(String[] args) {

        ArrayList<Unit> randomTeam1 = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            switch (new Random().nextInt(2)){
                case 0:
                    randomTeam1.add(new Sniper(team, 1, i));
                case 1:
                    randomTeam1.add(new Peasant(team, 1, i));
                    break;
                case 2:
                    randomTeam1.add(new Monk(team, 1, i));
                    break;
                case 3:
                    randomTeam1.add(new Crossbowman(team, 1, i));
                    break;
            }

            ArrayList<Unit> randomTeam2 = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                switch (new Random().nextInt(2)){
                    case 0:
                        randomTeam2.add(new Sniper(null, null, null, i, i, i, i, i, i));
                    case 1:
                        randomTeam2.add(new Peasant(null, null, null, i, i, i, i, i, i, i));
                        break;
    
                    case 2:
                        randomTeam2.add(new Monk(null, null, null, i, i, i, i, i, i, i));
                        break;
                    case 3:
                        randomTeam2.add(new Crossbowman(null, null, null, i, i, i, i, i, i));
                        break;
                }
       
            }

            
            randomTeam1.forEach(n -> System.out.println(n.getInfo()));
            System.out.println("_______________");
            randomTeam2.forEach(n -> System.out.println(n.getInfo()));
        
            System.out.println("+++++++++++");
            randomTeam1.forEach(n -> n.step());
            randomTeam1.forEach(n -> System.out.println(n.getInfo()));

            randomTeam1.sort(Unit::compareTo);
            System.out.println(randomTeam1);


        }
        
    }
}



