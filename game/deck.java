package game;
import java.util.ArrayList;
import java.util.Collections;
import game.card.rank;
import game.card.suit;

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

    public card getTopCard(){
        card topCard = deck.get(0);
        deck.remove(0);
        return topCard;
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
