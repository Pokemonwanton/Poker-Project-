package PokerGame;
import java.util.ArrayList;

public class Players {
   private ArrayList<Card> ownHand = new ArrayList<>();

     public Players(Card card1, Card card2) {
         ownHand.add(card1);
         ownHand.add(card2);
     }
   public String toString() {
    return ownHand.get(0) + "and " + ownHand.get(1);
   }
   public void setCards(Card x) {

   }
}