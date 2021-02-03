import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Player> playRound(List<Player> players){
        List<Player> roundWinners = new ArrayList<>();

        for(int i = 0; i < players.size(); i+=2) {
            System.out.println(players.get(i).getName());
            System.out.println(players.get(i+1).getName());
            System.out.println("Winner is: " + Game.playGame(players.get(i),players.get(i+1)).getName());
            roundWinners.add(Game.playGame(players.get(i),players.get(i+1)));
            System.out.println("Winners: " + roundWinners);
            System.out.println();
        }

        return roundWinners;
    }

    public static void main(String[] args) {
        PlayerDAO playerDAO = new PlayerDAOImpl();
        List<Player> players = playerDAO.getPlayers();
        Collections.shuffle(players);

        for (int i = 0; i < 4 ; i++){
            System.out.println("Round: " + i);
                players = playRound(players);
        }

    }
}
