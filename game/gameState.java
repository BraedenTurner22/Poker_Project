package game;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import game.card.rank;
import game.player.handRank;

public class gameState {
    
    private static deck deck = new deck();
    private ArrayList<player> players;
    private static ArrayList<card> board;
    private double pot;
    private String gameState;

    // public gameState(ArrayList<player> players) {
    //     this.players = players;
    //     board = new ArrayList<card>();
    //     this.pot = 0;
    //     this.gameState = "pre-flop";
    // }

    public ArrayList<player> getPlayers() {
        return players;
    }

    public static ArrayList<card> getBoard() {
        return board;
    }

    public static deck getDeck() {
        return deck;
    }

    public double getPot() {
        return pot;
    }

    public String getGameState() {
        return gameState;
    }

    public void dealCards() {
        deck.shuffleDeck();
        for (int i = 0; i < 2; i++) {
            for (player player : players) {
                player.addPlayerCard(deck.getTopCard());
            }
        }
    }

    public void dealFlop() {
        for(int i = 0; i < 3; i++) {
            board.add(deck.getTopCard());
        }
    }

    public void dealTurn() {
        board.add(deck.getTopCard());
    }

    public void dealRiver() {
        board.add(deck.getTopCard());
    }

    public void suitCounter(ArrayList<card> allCards) {

    }

    public void determineHandRank(ArrayList<card> board, player player) {

        handRank playerHandRank = null;
        ArrayList<card> allCards = new ArrayList<card>();
        allCards.addAll(board);
        allCards.addAll(player.getCards());
        boolean containsRoyalFlush = false;
// Figure out how to pass in royal flush hands into containsAll() method
// as I iterate through the suits
        for (card.suit suit : card.suit.values()) {
            ArrayList<card> royalFlush = new ArrayList<>();
            royalFlush.add(new card(suit, rank.TEN));
            royalFlush.add(new card(suit, rank.JACK));
            royalFlush.add(new card(suit, rank.QUEEN));
            royalFlush.add(new card(suit, rank.KING));
            royalFlush.add(new card(suit, rank.ACE));
            if (allCards.containsAll(royalFlush)) {
                playerHandRank = handRank.RFLUSH;
            }
        }
        for (card.suit suit: card.suit.values()) {
            
        }
    }

}