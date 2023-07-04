package PokerGame;

public class Card {

    private Suit mSuit;
    private Rank mRank;

    public Card(Suit suit, Rank rank) {
        this.mSuit = suit;
        this.mRank = rank;
    }

    public Suit getSuit() {
        return mSuit;
    }
    public Rank getRank() {
        return mRank; 
    }
    public String outputSuit() {
        Suit suit = mSuit;
        switch(suit) {
            case SPADES: return " of Spades";
            case HEARTS: return " of Hearts";
            case CLUBS: return " of Clubs"; 
            case DIAMONDS: return " of Diamonds";
            default: return " Not Possible";
        }
    }

    public int outputRank() {
        Rank rank = mRank;
        switch(rank) {
            case TWO: return 2; 
            case THREE: return 3;
            case FOUR: return 4;
            case FIVE: return 5;
            case SIX: return 6; 
            case SEVEN: return 7; 
            case EIGHT: return 8; 
            case NINE: return 9; 
            case TEN: return 10; 
            case JACK: return 11; 
            case QUEEN: return 12;
            case KING: return 13; 
            case ACE: return 1; 
            default: return -1; 
            }
    }
    public String toString() {
        return outputRank() + outputSuit();
    }


    @Override
    public boolean equals(Object o) {
        return (o != null && o instanceof Card && ((Card) o).mRank == mRank && ((Card) o).mSuit == mSuit);
    }


}