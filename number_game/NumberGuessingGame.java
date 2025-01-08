package number_game;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean continuePlaying = true;

        while (continuePlaying) {
            int secretNumber = random.nextInt(100) + 1;
            int attemptsMade = 0;
            int maxAttemptsAllowed = 10;
            boolean guessedCorrectly = false;
            
            System.out.println("I've thought of a number between 1 and 100. Can you guess what it is?");
            
            while (attemptsMade < maxAttemptsAllowed && !guessedCorrectly) {
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();
                attemptsMade++;
                
                if (userGuess < secretNumber) {
                    System.out.println("Oops! That's too low.");
                } else if (userGuess > secretNumber) {
                    System.out.println("Oops! That's too high.");
                } else {
                    System.out.println("Well done! You've guessed the number in " + attemptsMade + " attempts.");
                    guessedCorrectly = true;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Better luck next time! The number was " + secretNumber + ".");
            }
            
            System.out.print("Would you like to play another round? (yes/no): ");
            String playAgainResponse = scanner.next();
            continuePlaying = playAgainResponse.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing! Have a great day!");
        scanner.close();
    }
}
	