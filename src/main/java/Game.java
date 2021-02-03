import java.util.ArrayList;
import java.util.List;

public class Game {

    public static Player playGame(Player one, Player two){
        distributeCards(one, two);
        return gameWinner(one, two);
    }

    public static void distributeCards(Player one, Player two){
        List<Card> deck = Deck.getShuffledDeck();
        List<Card> FirstPlayerDeck = new ArrayList<>(deck.subList(0, (deck.size() + 1)/2));
        List<Card> SecondPlayerDeck = new ArrayList<>(deck.subList((deck.size() + 1)/2, deck.size()));
        one.setPlayerDeck(FirstPlayerDeck);
        two.setPlayerDeck(SecondPlayerDeck);
    }

    public static Player gameWinner(Player one, Player two){
        if(one.calculateDeckPoints() == two.calculateDeckPoints()){
            for (Card card: one.getPlayerDeck()) {
                if (card.getRank() == Rank.ACE  && card.getSuit() == Suit.HEARTH){
                    return one;
                }
            }
            return two;
        }
        if(one.calculateDeckPoints() > two.calculateDeckPoints()){
            return one;
        }
        return two;
    }
}
