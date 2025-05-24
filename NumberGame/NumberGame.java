import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("I've got a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Bingo! You got it!!");
                    guessedCorrectly = true;
                    totalScore += (maxAttempts - attempts + 1); 
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low, Try again.");
                } else {
                    System.out.println("Too high, You can do better.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("You ran out of attempts! The number was: " + numberToGuess );
            }

            System.out.println("Your total score so far: " + totalScore);

            System.out.print("Wanna play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("Alright, Let's play anytime later!");
        scanner.close();
    }
}
