import java.io.IOException;
import java.util.Scanner;

public class Game extends HighScore{
    private static Scanner scan = new Scanner(System.in);

    public static void AnotherGame() throws IOException {
        System.out.println("Play Again? (y/n) ");
        String anotherGame = scan.next();
        if (anotherGame.equals("y") || anotherGame.equals("Y")) {
            TargetCards.PlayGame();
            AnotherGame();
        } else {
            ReadFile();
        }
    }

    //Game is begin by running this static void main
    public static void main(String[] args) throws IOException {
        int choice = 0;
        boolean loop = true;

        while(loop) {

            System.out.println("Play Game (1) or View scoreboard (2) or Quit (3)");
            if (scan.hasNextInt())
                choice = scan.nextInt();

            switch (choice) {
                case 1:
                    TargetCards.PlayGame();
                    ReadFile();
                    AnotherGame();
                    break;
                case 2:
                    ReadFile();
                    break;
                case 3:
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
            }
        }



//        while (choice != 3 ) {
//            if (choice < 1 || choice > 3) {
//                System.out.println("View scoreboard (1) or Play Game (2) or Quit (3)");
//                choice = scan.nextInt();
//            }
//            if (choice == 1) {
//                menu();
//            }
//            else if (choice == 2){
//                ReadFile();
//                System.out.println("View scoreboard (1) or Play Game (2)");
//                choice = scan.nextInt();
//            }
//            else if (choice == 3){
//
//            }
//        }








//        TargetCards tc = new TargetCards();
//        System.out.println(tc);
//        tc.deck.shuffle();
//        System.out.println(tc);
//        for (int i=0; i < tc.deckSize(); i++) {
//            System.out.println( i + " : " + tc.deck.deal());
//        }
//        tc.deck.shuffle();
//        for (int i=0; i < tc.deckSize(); i++) {
//            System.out.println( i + " : " + tc.deck.deal());
//        }

//        Scanner scan = new Scanner(System.in);
//        int TargetValue = 51;
//        TargetCards tc = new TargetCards();
//
//        System.out.println("********************");
//        System.out.println("*** TARGET CARDS ***");
//        System.out.println("********************");
////        System.out.println(tc);
//
//
//        System.out.print("Enter first players name: ");
//        String Player1 = scan.nextLine();
//        System.out.print("Enter second players name: ");
//        String Player2 = scan.nextLine();
//        int round = 1;
//        boolean playAgain = true;
//        while (playAgain == true) {
//            tc.deck.shuffle();
//            if (round % 2 == 0) {
//                System.out.println("---- Game " + round + " of 4 ----");
//                System.out.println(Player1 + " has first guess");
//                System.out.println(Player1 + " how many cards: ");
//                int p1answer1 = scan.nextInt();
//                System.out.println(Player2 + " how many cards: ");
//                int p2answer1 = scan.nextInt();
//                System.out.println(Player1 + " >>>>");
//                int p1handValue = 0;
//                for (int i = 0; i < p1answer1; i++) {
//                    System.out.println(tc.deck.deal());
//                    p1handValue = p1handValue + tc.deck.deal().cardValue;
//                }
//                System.out.println();
//                System.out.println("HAND VALUE: " + p1handValue);
//                int player1score1 = TargetValue - p1handValue;
//                System.out.println(Player2 + " >>>>");
//                int p2handValue = 0;
//                for (int i = p1answer1; i < p1answer1 + p2answer1; i++) {
//                    System.out.println(tc.deck.deal());
//                    p2handValue = p2handValue + tc.deck.deal().cardValue;
//                }
//                System.out.println();
//                System.out.println("HAND VALUE: " + p2handValue);
//                int player2score1 = TargetValue - p2handValue;
//                System.out.println("This game " + Player1 + " scores " + player1score1 + ", " + Player2 + " scores " + player2score1);
//                if (player1score1 < player2score1) {
//                    System.out.println(Player1 + " is the winner");
//                } else
//                    System.out.println(Player2 + " is the winner");
//            }
//            else {
//                System.out.println("---- Game " + round + " of 4 ----");
//                System.out.println(Player2 + " has first guess");
//                System.out.println(Player2 + " how many cards: ");
//                int p2answer1 = scan.nextInt();
//                System.out.println(Player1 + " how many cards: ");
//                int p1answer1 = scan.nextInt();
//                System.out.println(Player2 + " >>>>");
//                int p2handValue = 0;
//                for (int i = 0; i < p2answer1; i++) {
//                    System.out.println(tc.deck.deal());
//                    p2handValue = p2handValue + tc.deck.deal().cardValue;
//                }
//                System.out.println();
//                System.out.println("HAND VALUE: " + p2handValue);
//                int player2score1 = TargetValue - p2handValue;
//                System.out.println(Player1 + " >>>>");
//                int p1handValue = 0;
//                for (int i = p2answer1; i < p2answer1 + p1answer1; i++) {
//                    System.out.println(tc.deck.deal());
//                    p1handValue = p1handValue + tc.deck.deal().cardValue;
//                }
//                System.out.println();
//                System.out.println("HAND VALUE: " + p1handValue);
//                int player1score1 = TargetValue - p1handValue;
//                System.out.println("This game " + Player2 + " scores " + player2score1 + ", " + Player1 + " scores " + player1score1);
//                if (player1score1 < player2score1) {
//                    System.out.println(Player1 + " is the winner");
//                } else
//                    System.out.println(Player2 + " is the winner");
//            } round++;
//        }
//        System.out.println("Play Again? (y/n) ");
//        String anothergame = scan.nextLine();
//        if (anothergame.equals("n") || anothergame.equals("N")) {
//            playAgain == false;
//        }
//        System.out.println("Game over!");
//    }
    }
}