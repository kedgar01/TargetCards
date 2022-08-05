import java.io.IOException;
import java.util.Scanner;

public class TargetCards extends Setup {

    // Sets up the number of cards on the board
    private static final int size = 52;

    // Sets up the ranks of the cards
    private static final String[] ranks = {"ace", "2", "3", "4", "5", "6",
            "7", "8", "9", "10", "jack", "queen", "king"};

    // Sets up the suits of the cards
    private static final String[] suits = {"spades", "hearts", "diamonds",
            "clubs"};

    // Sets up the point values of the cards
    private static final int[] values = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            10, 10, 10};


    //using super constructor to create the deck and start the game
    public TargetCards() {
        super(size, ranks, suits, values);
    }

    //here is the main code used to actually play the game
    public static void PlayGame() throws IOException {
        Scanner scan = new Scanner(System.in);
        int TargetValue = 51;
        TargetCards tc = new TargetCards();

        System.out.println("********************");
        System.out.println("*** TARGET CARDS ***");
        System.out.println("********************");


        System.out.print("Enter first players name: ");
        String Player1 = scan.nextLine();
        System.out.print("Enter second players name: ");
        String Player2 = scan.nextLine();
        int round = 1;
        int p1GameScore = 0;
        int p2GameScore = 0;
        while (round <= 4) {
            tc.deck.shuffle();
            if (round % 2 == 0) {
                System.out.println("---- Game " + round + " of 4 ----");
                System.out.println(Player1 + " has first guess");
                System.out.println(Player1 + " how many cards: ");
                int p1answer = scan.nextInt();
                System.out.println(Player2 + " how many cards: ");
                int p2answer = scan.nextInt();
                System.out.println(Player1 + " >>>>");
                int p1handValue = 0;
                for (int i = 0; i < p1answer; i++) {
                    Card cardDealt = tc.deck.deal();
                    p1handValue = p1handValue + cardDealt.cardValue;
                    System.out.println(cardDealt);
                }
                int player1score = 0;
                if (p1handValue > TargetValue) {
                    p1handValue = 51;
                    player1score = 51;
                }
                else if (p1handValue == TargetValue){
                    p1handValue = 0;
                }
                else {
                    player1score = TargetValue - p1handValue;
                }
                System.out.println();
                System.out.println("HAND VALUE: " + p1handValue);
                p1GameScore = p1GameScore + player1score;
                System.out.println(Player2 + " >>>>");
                int p2handValue = 0;
                for (int i = p1answer; i < p1answer + p2answer; i++) {
                    Card cardDealt = tc.deck.deal();
                    p2handValue = p2handValue + cardDealt.cardValue;
                    System.out.println(cardDealt);
                }
                int player2score = 0;
                if (p2handValue > TargetValue) {
                    p2handValue = 51;
                    player2score = 51;
                }
                else if (p2handValue == TargetValue){
                    p2handValue = 0;
                }
                else {
                    player2score = TargetValue - p2handValue;
                }
                System.out.println();
                System.out.println("HAND VALUE: " + p2handValue);
                p2GameScore = p2GameScore + player2score;
                System.out.println("This game " + Player1 + " scores " + player1score + ", " + Player2 + " scores " + player2score);
                if (player1score < player2score) {
                    System.out.println(Player1 + " is the winner");
                } else
                    System.out.println(Player2 + " is the winner");
            } else {
                System.out.println("---- Game " + round + " of 4 ----");
                System.out.println(Player2 + " has first guess");
                System.out.println(Player2 + " how many cards: ");
                int p2answer = scan.nextInt();
                System.out.println(Player1 + " how many cards: ");
                int p1answer = scan.nextInt();
                System.out.println(Player2 + " >>>>");
                int p2handValue = 0;
                for (int i = 0; i < p2answer; i++) {
                    Card cardDealt = tc.deck.deal();
                    p2handValue = p2handValue + cardDealt.cardValue;
                    System.out.println(cardDealt);
                }
                int player2score = 0;
                if (p2handValue > TargetValue) {
                    p2handValue = 51;
                    player2score = 51;
                }
                else if (p2handValue == TargetValue){
                    p2handValue = 0;
                }
                else {
                    player2score = TargetValue - p2handValue;
                }
                System.out.println();
                System.out.println("HAND VALUE: " + p2handValue);
                p2GameScore = p2GameScore + player2score;
                System.out.println(Player1 + " >>>>");
                int p1handValue = 0;
                for (int i = p2answer; i < p2answer + p1answer; i++) {
                    Card cardDealt = tc.deck.deal();
                    p1handValue = p1handValue + cardDealt.cardValue;
                    System.out.println(cardDealt);
                }
                int player1score = 0;
                if (p1handValue > TargetValue) {
                    p1handValue = 51;
                    player1score = 51;
                }
                else if (p1handValue == TargetValue){
                    p1handValue = 0;
                }
                else {
                    player1score = TargetValue - p1handValue;
                }
                System.out.println();
                System.out.println("HAND VALUE: " + p1handValue);
                p1GameScore = p1GameScore + player1score;
                System.out.println("This game " + Player2 + " scores " + player2score + ", " + Player1 + " scores " + player1score);
                if (player1score < player2score) {
                    System.out.println(Player1 + " is the winner");
                } else
                    System.out.println(Player2 + " is the winner");
            }
            round++;
        }
        System.out.println("*** FINAL SCORE ***");
        System.out.println(Player1 + " has " + p1GameScore  + " points ");
        HighScore.AddScores(Player1 + "\t" + p1GameScore);
        System.out.println(Player2 + " has " + p2GameScore  + " points ");
        HighScore.AddScores(Player2 + "\t" + p2GameScore);
        if (p1GameScore < p2GameScore) {
            System.out.println(Player1 + " wins!");
        }
        else
            System.out.println(Player2 + " wins!");
    }
}