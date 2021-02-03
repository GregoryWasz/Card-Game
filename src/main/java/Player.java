import java.util.List;

public class Player {
    private String name;
    private List<Card> playerDeck;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, List<Card> playerDeck) {
        this.name = name;
        this.playerDeck = playerDeck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(List<Card> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public int calculatePoints(){
        int deckPoints = 0;
        for (Card card: getPlayerDeck()) {
            deckPoints+=card.getRank().getPoint();
        }
        return deckPoints;
    }
}
