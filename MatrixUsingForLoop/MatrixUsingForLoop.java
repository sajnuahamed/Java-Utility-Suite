/**
 * Converts a 1D flat array into a 2D matrix format and prints it to the console
 * using nested for loops.
 */
public class MatrixUsingForLoop {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4};

        int matrixWidth = 3;
        int matrixHeight = 6;

        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {

                int index = i * matrixWidth + j;

                if (index < numbers.length) {
                    System.out.print(numbers[index] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}