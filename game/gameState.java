package game;
import java.util.ArrayList;

public class gameState {
    
    private ArrayList<player> players;
    private ArrayList<card> board;
    private double pot;
    private String gameState;

    public gameState(double pot, String gameState) {
        this.players = new ArrayList<player>();
        this.board = new ArrayList<card>();
        this.pot = 0;
        this.gameState = "pre-flop";
    }

    public ArrayList<player> getPlayers() {
        return players;
    }

    public ArrayList<card> getBoard() {
        return board;
    }

    public double getPot() {
        return pot;
    }

    public String getGameState() {
        return gameState;
    }

    public void dealCards() {
        deck = deck.deck.createDeck();
        for (int i = 0; i < 2; i++) {
            for (player player : players) {
                player.addPlayerCard();
            }
        }
    }
}
