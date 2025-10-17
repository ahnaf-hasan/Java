import java.util.Scanner;

public class SimpleDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

       
        if (denominator == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
