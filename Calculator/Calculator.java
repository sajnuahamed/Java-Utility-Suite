
import java.util.Scanner;

/**
 * Performs basic arithmetic and exponential operations based on user input. It
 * accepts two numbers and an operator, handles division-by-zero checks, and
 * formats the final result.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result;
        char operator;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator [+-*/%^]: ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' ->
                result = num1 + num2;
            case '-' ->
                result = num1 - num2;
            case '*' ->
                result = num1 * num2;
            case '/', '%' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }

                result = operator == '/' ? num1 / num2 : num1 % num2;
            }
            case '^' ->
                result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid selection of operator!");
                return;
            }
        }

        System.out.printf("Result: %.2f", result);
        scanner.close();

    }
}
