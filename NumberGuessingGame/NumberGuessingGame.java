import java.util.Random;
import java.util.Scanner;

/**
 * A simple number guessing game. The program generates a random number between
 * 1 and 10, and the user keeps guessing until the correct number is entered.
 *
 * @author Sajnu
 */
public class NumberGuessingGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int targetNumber = random.nextInt(1, 11);
            int guess;
            int attempts = 0;

            do {
                System.out.print("Guess a number from 1 to 10: ");
                guess = scanner.nextInt();

                if (guess < targetNumber) {
                    System.out.println("Oops! Too Low! Try again!!");
                } else if (guess > targetNumber) {
                    System.out.println("Oops! Too High! Try again!!");
                }
                attempts++;
            } while (guess != targetNumber);

            System.out.println(
                    "🎉 Congratulations! You guessed the number in "
                    + attempts + " attempts."
            );
        }
    }
}
