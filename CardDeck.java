package PokerGame;
import java.util.ArrayList;
import java.util.Random;
public class CardDeck {
    private ArrayList<Card> mCards; 
    private ArrayList<Card> mPulledCards; 
    private Random mRandom; 
    private int value;
    private int count = 0; 

    public CardDeck() {
        mRandom = new Random();
        mPulledCards = new ArrayList<Card>();
        mCards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
        reset();
    }
    public int getValue() {
        return value;
    }
    public void getCards() {
        int randomNumber = randInt(0,52-mPulledCards.size());
        Card playerCard = mCards.get(randomNumber);
        mPulledCards.add(playerCard);
        mCards.remove(randomNumber);
        int randomNumber2 = randInt(0,53-mPulledCards.size());
        Card playerCard2 = mCards.get(randomNumber); 
        mPulledCards.add(playerCard2);
        mCards.remove(randomNumber2);
    }
    public Card grabbingPulledCard() {
        return mCards.get(count++);
    }
    public String outputmPulledCards() {
        String outputString = ""; 
        for(int i = 0; i < mPulledCards.size(); i++) {
            System.out.println(mPulledCards.get(i).toString());
        }
        return outputString;
    }

    public void reset() {
        mPulledCards.clear();
        mCards.clear();
        /* Creating all possible cards... */
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                mCards.add(c);
            }
        }
    }
    
    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public int randInt(int min, int max) {
        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = mRandom.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    
    public boolean isEmpty(){
        return mCards.isEmpty();
    }
}