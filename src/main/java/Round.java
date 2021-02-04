import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Player> roundPlayers;
    private List<Player> roundWinners;

    public Round(List<Player> roundPlayers) {
        this.roundPlayers = roundPlayers;
    }

    public void play(){
        roundWinners = new ArrayList<>();

        for(int i = 0; i < roundPlayers.size(); i+=2) {
            System.out.println("Match: " + ((i/2)+1));
            System.out.println("First player: " + roundPlayers.get(i).getName());
            System.out.println("Second player: " + roundPlayers.get(i+1).getName());
            Deck deck = new Deck();
            deck.shuffleDeck();
            Match match = new Match(roundPlayers.get(i), roundPlayers.get(i+1), deck.getDeck());
            match.play();
            roundWinners.add(match.getWinner());
            System.out.println("Winner is: " + match.getWinner().getName());
            System.out.println();
        }
    }

    public List<Player> getRoundWinners() {
        return roundWinners;
    }

}
