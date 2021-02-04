import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        this.deck = cards;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public List<Card> getDeck(){
        return deck;
    }
}
