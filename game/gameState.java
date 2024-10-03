package game;
import java.util.ArrayList;

public class gameState {
    
    private ArrayList<player> players;
    private ArrayList<card> board;
    private deck deck;
    private double pot;
    private String gameState;

    public gameState(ArrayList<player> players, deck deck) {
        this.players = players;
        this.board = new ArrayList<card>();
        this.deck = deck;
        this.pot = 0;
        this.gameState = "pre-flop";
    }

    public ArrayList<player> getPlayers() {
        return players;
    }

    public ArrayList<card> getBoard() {
        return board;
    }

    public deck getDeck() {
        return deck;
    }

    public void makeDeck(deck deck) {
        this.deck = deck;
    }

    public double getPot() {
        return pot;
    }

    public String getGameState() {
        return gameState;
    }

    public void dealCards() {
        for (int i = 0; i < 2; i++) {
            for (player player : players) {
                player.addPlayerCard();
            }
        }
    }
}
