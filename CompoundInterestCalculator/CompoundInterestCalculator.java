import java.util.Scanner;

/**
 * Computes the final accumulated amount using the standard compound interest
 * formula A = P(1 + r/n)ⁿᵗ
 */
public class CompoundInterestCalculator {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            double principal;
            double rate;
            double amount;
            int compoundsPerYear;
            int year;

            System.out.print("Enter the principal amount: ");
            principal = scanner.nextDouble();
            System.out.print("Enter the interest rate (in %): ");
            rate = scanner.nextDouble() / 100;
            System.out.print("Enter the number of times compounded per year: ");
            compoundsPerYear = scanner.nextInt();
            System.out.print("Enter the number of years: ");
            year = scanner.nextInt();

            // Calculate compound interest --
            amount = principal * Math.pow((1 + (rate / compoundsPerYear)), compoundsPerYear * year);
            System.out.printf("The amount after %d year/s is: %.2f%n", year, amount);
        }
    }
}
