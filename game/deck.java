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
        String suitArray[] = {"spades", "clubs", "diamonds", "hearts"};
        String rankArray[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
        for(String suit : suitArray) {
            for (String rank : rankArray) {
                deck.add(new card(rank, suit));
            }
        }
        return deck;
    }
}
