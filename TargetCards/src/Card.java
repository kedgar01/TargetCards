public class Card {

    String suit;
    String rank;
    int cardValue;

    public Card(String cardRank, String cardSuit, int cardPointValue)
    {
        rank = cardRank;
        suit = cardSuit;
        cardValue = cardPointValue;
    }

    public String suit()
    {
        return suit;
    }


    public String rank()
    {
        return rank;
    }


    public int cardValue()
    {
        return cardValue;
    }

    //return cards rank and suit
    public String toString()
    {
        return rank + " of " + suit ;
    }

    //test for card class
    public static void main(String[] args) {
        Card card = new Card("Ace", "Diamonds", 11);
        System.out.println(card);
        System.out.println("Card Rank: " + card.rank());
        System.out.println("Card suit: " + card.suit());
        System.out.println("Card point value: " + card.cardValue());
    }
}