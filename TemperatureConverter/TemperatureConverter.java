import java.util.Scanner;

/**
 * Converts temperatures between Celsius and Fahrenheit using ternary operators.
 */
public class TemperatureConverter {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double temp;
            double newTemp;
            String conversionUnit;
            System.out.println("=====TEMPERATURE CONVERTER====");
            System.out.print("""
                                     Enter your choice :
                                      Celsius to Fahrenheit [F]
                                      Fahrenheit to Celsius [C]""");
            conversionUnit = scanner.nextLine().toUpperCase();
            if (conversionUnit.equals("C") || conversionUnit.equals("F")) {
                System.out.println("Enter the temperature :");
                temp = scanner.nextDouble();
                newTemp = conversionUnit.equals("F") ? (temp * 9.0 / 5.0) + 32 : (temp - 32) * (5.0 / 9.0);
                String resultUnit = conversionUnit.equals("C") ? "F" : "C";
                System.out.printf("The temperature is: %.2f°%s", newTemp, resultUnit);
            } else {
                System.out.println("Invalid Choice!!");
            }
        } 
    }
}

