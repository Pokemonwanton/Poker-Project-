package PokerGame;
import java.util.ArrayList;

public class HandStrength {
        ArrayList<Card> board = new ArrayList<Card>;
    public HandStrength(Card card) {
        board.add(card);
    }
/**
 * private boolean HighCard() {
        int highCard = 0;
        for(int i = 0; i < board.size();i++) {
            if(board[i].getRank > highCard) {
                highCard = board[i].getRank; 
            }
        }
        return highCard;
    }
    private int Pair() {
        int isThereAPair = 0; 
        for(int i = 1; i < board.length; i++) {
            if(board[i - 1].getRank == board[i]) {
                isThereaPair == 1; 
            }
        }
        if(isThereAPair == 1) {
            return 1; 
        }
        return 0;
    }
    private boolean TwoPair() { 
        int isThereTwoPairs = 0;
        for(int i = 1; i < board.length; i++) {
            if(board[i - 1].getRank == board[i]) {
                isThereTwoPairs++; 
            }
        }
        if(isThereTwoPairs == 2) {
            return 1;
        }
        return 0; 
    }
    private int Trips() {
        int isThereTrips = 0; 
        for(int i = 2; i < board.length; i++) {
            if(board.get(i).getRank == board[i - 1] &&
             board[i - 1].getRank == board[i - 0]) {
                isThereTrips++; 
             }
        }
        if(isThereTrips == 1 ) {
            return 1; 
        }
        return 0; 
    }
 */

    private boolean Straight() {
         
    }
    private boolean Flush() {
    
    }
    private boolean  FullHouse() {

    }
    private boolean FourOfaKind() {

    }
    private boolean StraightFlush() {

    }
    private boolean RoyalFlush() {

    }
    public boolean CheckingAllHands() {
        //HighCard();
        //Pair();
        //TwoPair(); 
        //Trips();
        Straight();
        Flush();
        FullHouse();
        FourOfaKind();
        StraightFlush();
        RoyalFlush();
    }
}
