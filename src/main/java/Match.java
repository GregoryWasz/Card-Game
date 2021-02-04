import java.util.ArrayList;
import java.util.List;

public class Match {
    private Player playerOne;
    private Player playerTwo;
    private List<Card> deck;
    private Player winner;

    public Match(Player playerOne, Player playerTwo, List<Card> deck) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.deck = deck;

    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void play(){
        distributeCards();
        winner = chooseWinner();
    }

    protected void distributeCards(){
        List<Card> FirstPlayerDeck = new ArrayList<>(deck.subList(0, (deck.size() + 1)/2));
        List<Card> SecondPlayerDeck = new ArrayList<>(deck.subList((deck.size() + 1)/2, deck.size()));
        playerOne.setPlayerDeck(FirstPlayerDeck);
        playerTwo.setPlayerDeck(SecondPlayerDeck);
    }

    protected Player chooseWinner(){
        int playerOnePoints = calculatePlayerPoints(playerOne);
        int playerTwoPoints = calculatePlayerPoints(playerTwo);

        if(playerOnePoints == playerTwoPoints){
            for (Card card: playerOne.getPlayerDeck()) {
                if (card.getRank() == Rank.ACE  && card.getSuit() == Suit.HEARTH){
                    return playerOne;
                }
            }
            return playerTwo;
        }

        if(playerOnePoints > playerTwoPoints){
            return playerOne;
        } else {
            return playerTwo;
        }
    }

    protected int calculatePlayerPoints(Player player){
        int deckPoints = 0;
        for (Card card: player.getPlayerDeck()) {
            deckPoints+=card.getRank().getPoint();
        }
        return deckPoints;
    }

}
