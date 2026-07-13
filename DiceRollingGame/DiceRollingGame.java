import java.util.Random;
import java.util.Scanner;

/**
 * Simulates rolling one or more dice and displays the result using ASCII
 * representations of dice faces.
 */
public class DiceRollingGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numOfDice;
            int total = 0;
            Random random = new Random();
            System.out.println("Enter the number of dice you have: ");
            numOfDice = scanner.nextInt();

            if (numOfDice > 0) {
                for (int i = 0; i < numOfDice; i++) {
                    int diceValue = random.nextInt(1, 7);
                    total += diceValue;
                    printDice(diceValue);
                }
                System.out.println("Total: " + total);
            } else {
                System.out.println("Please enter a positive number!!");
            }
        }
    }

    private static void printDice(int diceValue) {
        String diceFace1 = """
                           --------
                          |        |
                          |   ■    |
                          |        |
                           --------
                         """;
        String diceFace2 = """
                           --------
                          |        |
                          |  ■ ■  |
                          |        |
                           --------
                         """;
        String diceFace3 = """
                           --------
                          |   ■   |
                          |        |
                          |  ■ ■  |
                           --------
                         """;
        String diceFace4 = """
                           --------
                          |  ■ ■  |
                          |        |
                          |  ■ ■  |
                           --------
                         """;
        String diceFace5 = """
                           --------
                          |   ■   |
                          |  ■ ■  |
                          |  ■ ■  |
                           --------
                         """;
        String diceFace6 = """
                           --------
                          |  ■ ■  |
                          |  ■ ■  |
                          |  ■ ■  |
                           --------
                         """;
        switch (diceValue) {
            case 1 ->
                System.out.println(diceFace1);
            case 2 ->
                System.out.println(diceFace2);
            case 3 ->
                System.out.println(diceFace3);
            case 4 ->
                System.out.println(diceFace4);
            case 5 ->
                System.out.println(diceFace5);
            case 6 ->
                System.out.println(diceFace6);
            default ->
                System.out.println("Invalid!!");

        }
    }
}
