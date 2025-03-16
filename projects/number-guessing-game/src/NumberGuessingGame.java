import java.util.Random; // Importing necessary library for random number generation
import java.util.Scanner; // Importing scanner library

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Generates a number between 1-100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Initializing scanner
        Scanner scanner = new Scanner(System.in);

        // Gameplay
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.\n");

        boolean guessedCorrectly = false;
        int attempts = 1;
        while (!guessedCorrectly) {
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Correct! It took " + attempts + " attempts.");
                System.out.println("Would you like to play again?");
                System.out.println("1. Yes / 2. No");
                int yesNo = scanner.nextInt();
                switch (yesNo) {
                    case 1:
                        guessedCorrectly = false;
                        attempts = 1;
                        randomNumber = random.nextInt(100) + 1;
                        break;
                    case 2:
                        guessedCorrectly = true;
                        System.out.println("Exiting...");
                        break;
                }
            } else if (guess > randomNumber){
                System.out.println("Too high! Try again");
                attempts++;
            } else {
                System.out.println("Too low! Try again");
                attempts++;
            }
        }
        scanner.close();
    }
}