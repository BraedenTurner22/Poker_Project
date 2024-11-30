package game;
import java.util.ArrayList;

public class player {

    public enum position {
        SBLIND(0),
        BBLIND(1),
        UTG(2),
        UTGP1(3),
        UTGP2(4),
        LJACK(5),
        HJACK(6),
        CUTOFF(7),
        BUTTON(8);

        private final int value;

        public int getValue() {
            return value;
        }

        position(int value) {
            this.value = value;
        }
    }

    public enum handRank {
        HCARD(0),
        ONEPAIR(1),
        TWOPAIR(2),
        TOAK(3),
        STRAIGHT(4),
        FLUSH(5),
        FHOUSE(6),
        QUADS(7),
        SFLUSH(8),
        RFLUSH(9);

        private final int value;

        public int getValue() {
            return value;
        }

        handRank(int value) {
            this.value = value;
        }
    }

    private String name;
    private ArrayList<card> userCards;
    private double money;
    private handRank handRank;
    private position position;
    private double betSize;
    private Boolean isTurn;

    public player(String name, position position, handRank handRank, double money) {
        this.name = name;
        this.position = position;
        this.handRank = handRank;
        this.userCards = new ArrayList<card>();
        this.money = money;
        this.isTurn = false;
        this.betSize = 0;
    }
    
    public String getName() {
        return name;
    }

    public position getPosition() {
        return position;
    }

    public ArrayList<card> getCards() {
        return userCards;
    }
    
    public void addPlayerCard(card addedCard) {
        userCards.add(addedCard);
    }

    public double getMoney() {
        return money;
    }

    public Boolean getTurn() {
        return isTurn;
    }

    public double getBetSize() {
        return betSize;
    }

    public handRank getHandrank() {
        return handRank;
    }

    public void setHandRank(handRank handRank) {
        this.handRank = handRank;
    }

}
