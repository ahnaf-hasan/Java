import java.util.Scanner;

public class MultiplicationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Multiply
        int result = a * b;

        // Output the result
        System.out.println("Multiplication result: " + result);
    }
}
