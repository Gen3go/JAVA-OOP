import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.jar.Attributes.Name;

public class Game {

    public static void main(String[] args) {
        // Peasant peasant = new Peasant(null, null, 0, 0, 0, 0, 0, 0, 0);
        // Monk monk = new Monk(null, null, 0, 0, 0, 0, 0, 0, 0);

        ArrayList<Unit> randomTeam1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)){
                case 0:
                    randomTeam1.add(new Sniper(null, null, i, i, i, i, i, i));
                case 1:
                    randomTeam1.add(new Peasant(null, null, i, i, i, i, i, i, i));
                    break;
                case 2:
                    randomTeam1.add(new Monk(null, null, i, i, i, i, i, i, i));
                    break;
                case 3:
                    randomTeam1.add(new Crossbowman(null, null, i, i, i, i, i, i));
                    break;
            }

            ArrayList<Unit> randomTeam2 = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                switch (new Random().nextInt(4)){
                    case 0:
                        randomTeam2.add(new Sniper(null, null, i, i, i, i, i, i));
                    case 1:
                        randomTeam2.add(new Peasant(null, null, i, i, i, i, i, i, i));
                        break;
    
                    case 2:
                        randomTeam2.add(new Monk(null, null, i, i, i, i, i, i, i));
                        break;
                    case 3:
                        randomTeam2.add(new Crossbowman(null, null, i, i, i, i, i, i));
                        break;
                }
       
            }

            randomTeam1.forEach(n -> System.out.println(n.getInfo()));
            randomTeam2.forEach(n -> System.out.println(n.getInfo()));
        
        }
        
    }

}


