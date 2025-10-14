import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Print the pyramid pattern

        for (int i = 1; i <= rows; i++) {
          
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            
            System.out.println();
        }

        scanner.close();
    }
}
