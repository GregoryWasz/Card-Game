public class Card {
    private Suit Suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        Suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return Suit;
    }

    public void setSuit(Suit Suit) {
        this.Suit = Suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Suit=" + Suit +
                ", rank=" + rank +
                '}' + '\n';
    }
}
