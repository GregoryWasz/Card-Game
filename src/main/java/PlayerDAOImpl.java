import java.util.ArrayList;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO{
    @Override
    public List<Player> getPlayers() {
            List<Player> players = new ArrayList<>();

            players.add(new Player("A"));
            players.add(new Player("B"));
            players.add(new Player("C"));
            players.add(new Player("D"));
            players.add(new Player("E"));
            players.add(new Player("F"));
            players.add(new Player("G"));
            players.add(new Player("H"));
            players.add(new Player("I"));
            players.add(new Player("J"));
            players.add(new Player("K"));
            players.add(new Player("L"));
            players.add(new Player("M"));
            players.add(new Player("N"));
            players.add(new Player("O"));
            players.add(new Player("P"));

            return players;
    }
}
