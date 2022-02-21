import java.util.Scanner;
import java.util.Random;

/**
 * A singleton game
 */
public class MathGame {

   private static MathGame mathGame;
   private int score = 0;
   private Scanner reader;
   private String[] operands = {"+", "-", "*", "/"};

   /**
    * Creates a new MathGame
    */
   private MathGame() {
        Random random = new Random();
        reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
   }

   /**
    * Will create and return a new instance of MathGame, or returns the existing instance
    * @return instance of MathGame
    */
   public static MathGame getInstance() {
       if(mathGame == null) {
           System.out.println("Creating a Math Game.");
           mathGame = new MathGame();
       }
       return mathGame;
   }

   /**
    * Contains a loop that will keep playing for as long as the user wants to
    */
   public void play() {
       boolean hasQuit = false;
       while (hasQuit == false) {
           System.out.println("(P)lay or (Q)uit:");
           String phrase = reader.nextLine();
           if (phrase.toLowerCase().equals("p")) {
               if (playRound()) score++;
           } else if (phrase.toLowerCase().equals("q")) {
               System.out.println("You won " + score + " games!");
               hasQuit = true;
               System.out.println("Goodbye.");
           } else {
               System.out.println("Sorry, you must enter p or q");
           }
       }
   }

   /**
    * Generates a random number, picks a random operator, and prompts a question
    * @return Returns true if the player guesses correctly
    */
   private boolean playRound() {
       double a = Math.floor(Math.random()*(100)+1);
       double b = Math.floor(Math.random()*(100)+1);
       String operator = operands[(int)Math.floor(Math.random()*(3-0+1)+0)];
       double correct = 0;
       System.out.println('\n'+"Round answer to 1 decimal place");
       System.out.println((int)a +" " + operator + " " + (int)b + " = ?");
       switch(operator) {
            case "+": correct = a + b;
                break;
            case "-": correct = a - b;
                break;
            case "*": correct = a * b;
                break;
            case "/": correct = a / b;
                break;
       }
       correct = (double)Math.round(correct * 10) / 10;
       if (correct == reader.nextDouble()) {
           reader.nextLine();
           System.out.println("You got it!");
           return true;
       } else {
           reader.nextLine();
           System.out.println("The correct answer is: " + correct);
           return false;
       }

   }
}
