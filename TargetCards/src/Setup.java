public class Setup {

    Card[] cards; // Cards that will be dealt

    Deck deck; // deck of cards


    //sets up the game by initialising everything when called through super constructor in TargetCards.java
    public Setup(int size, String[] ranks, String[] suits, int[] pointValues) {
        cards = new Card[size];
        deck = new Deck(ranks, suits, pointValues);
        dealMyCards();
    }

    //deals cards to the board
    private void dealMyCards() {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null)
                cards[i] = deck.deal();
        }
    }
}