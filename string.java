import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       
        System.out.println("Original String: " + name);

       
        String upper = name.toUpperCase();
        System.out.println("Uppercase: " + upper);

     
        String lower = name.toLowerCase();
        System.out.println("Lowercase: " + lower);

       
        int length = name.length();
        System.out.println("Length: " + length);

      
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println("Reversed: " + reversed);

      
        if (name.contains("a") || name.contains("A")) {
            System.out.println("Your name contains the letter 'a'.");
        } else {
            System.out.println("Your name does not contain the letter 'a'.");
        }

        scanner.close();
    }
}

