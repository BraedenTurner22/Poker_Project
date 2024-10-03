package game;
import java.util.ArrayList;
import java.util.Collections;

public class deck {

    private ArrayList<card> deck;

    public deck() {
        this.deck = new ArrayList<card>();
    }

    public ArrayList<card> getDeck() {
        return deck;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public ArrayList<card> createDeck(){

        for(card.suit suit : suit.values()) {
            for (card.rank rank : rank.values()) {
                deck.add(new card(suit, rank));
            }
        }
        return deck;
    }
}
