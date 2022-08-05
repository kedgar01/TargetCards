public class Deck {

    private final ArrayList<Card> cards;
    private int deckSize;

    //constructor
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<>();

        //cards added to arraylist
        for (int i = 0; i < ranks.length; i++) {
            for (String suit : suits) {
                Card newCard = new Card(ranks[i], suit, values[i]);
                cards.add(newCard);
            }
        }
        deckSize = cards.getLength();
        shuffle();
    }

    //Deal cards while also removing them from array
    public Card deal() {
        if (deckSize > 0) {
            deckSize--;
            return cards.getEntry(deckSize);
        } else
            return null;
    }

    //replaces each card in the deck with a new random position
    public void shuffle() {
        for (int s = cards.getLength() - 1; s > 0; s--) {
            int quantity = s + 1;
            Card replacement = cards.getEntry(s);
            int randomPosition = (int) (Math.random() * quantity);
            cards.replace(s, cards.getEntry(randomPosition));
            cards.replace(randomPosition, replacement);
        }
        deckSize = cards.getLength();
    }

    //Deck class test
    public static void main (String[] args) {
        String[] testRank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        String[] testSuit = { "Diamonds", "Clubs", "Hearts", "Spades" };
        int[] testValue = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        Deck deckTwo = new Deck(testRank, testSuit, testValue);
        int size = deckTwo.deckSize;
        System.out.println("DeckTwo dealt card is: " + deckTwo.deal());
        deckTwo.shuffle();
        System.out.println(deckTwo.deckSize);
        for (int i=0; i < size; i++) {
            System.out.println( i + ":" + deckTwo.deal());
        }
        }
}






//1) cards chosen (input by user) will be dealt and values will be added  and shown
//2) shuffle cards/deck
//3) game 2, 3 and 4 follows same protocol
//4) each players scores from each game are added together displayed for each player
//5) winner is displayed