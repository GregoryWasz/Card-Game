import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    public static List<Card> getShuffledDeck(){
        List<Card> cards = getNewDeck();
        Collections.shuffle(cards);
        return cards;
    }

    public static List<Card> getNewDeck(){
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        return cards;
    }
}
