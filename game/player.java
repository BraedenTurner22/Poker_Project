package game;
import java.util.ArrayList;

public class player {

    private String name;
    private int position;
    private ArrayList<card> userCards;
    private double money;
    private double betSize;
    private Boolean isTurn;

    public player(String name, int position, double money, Boolean isTurn, double betSize) {
        this.name = name;
        this.position = position;
        this.userCards = new ArrayList<card>();
        this.money = money;
        this.isTurn = isTurn;
        this.betSize = 0;
    }
    
    public String getName() {
        return name;
    }

    public int getPosition() {
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

}
