import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlayerDAO playerDAO = new PlayerDAOImpl();
        List<Player> players = playerDAO.getPlayers();

        Collections.shuffle(players);

        int rounds = players.size()/4;

        for (int i = 0; i < rounds ; i++){
            System.out.println("Round: " + (i+1));
            System.out.println();
            Round r = new Round(players);
            r.play();
            players = r.getRoundWinners();
        }

    }
}
