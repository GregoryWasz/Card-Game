import java.util.ArrayList;
import java.util.List;

public class Game {
    public static Player newGameWinner(Player one, Player two){
        List<Card> deck = Deck.getShuffledDeck();
        int deckSize = deck.size();
        List<Card> FirstPlayerDeck = new ArrayList<>(deck.subList(0, (deckSize + 1)/2));
        List<Card> SecondPlayerDeck = new ArrayList<>(deck.subList((deckSize + 1)/2, deckSize));
        one.setPlayerDeck(FirstPlayerDeck);
        two.setPlayerDeck(SecondPlayerDeck);
        System.out.println(one.getName() + " " + one.calculatePoints());
        System.out.println(two.getName() + " " + two.calculatePoints());
        if(one.calculatePoints() == two.calculatePoints()){
            for (Card card: one.getPlayerDeck()) {
                if (card.getRank() == Rank.ACE  && card.getSuit() == Suit.HEARTH){
                    return one;
                }
            }
            return two;
        }
        if(one.calculatePoints() > two.calculatePoints()){
            return one;
        }
        return two;
    }
}
