package game;

public class card {

    public enum suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    public enum rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        private final int value;

            public int getValue() {
                return value;
           }

           rank(int value) {
               this.value = value;
          }
    }

    private final suit suit;
    private final rank rank;

    public card(suit suit, rank rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public rank getRank() {
        return rank;
    }

    public suit getSuit() {
        return suit;
    }
}
