package game;
import java.util.ArrayList;

public class cardLogic {
    
private ArrayList<card> userCards;
private ArrayList<card> board;

    public cardLogic(ArrayList<card> userCards, ArrayList<card> board) {
        this.userCards = userCards;
        this.board = board;
    }
}