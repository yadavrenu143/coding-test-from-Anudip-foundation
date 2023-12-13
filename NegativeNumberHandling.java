package mocktest;
import java.util.Scanner;

// Custom exception class for negative input
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// create classs

public class NegativeNumberHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int userInput = scanner.nextInt();

            if (userInput < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            System.out.println("The number entered is: " + userInput);
        } catch (NegativeNumberException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
            // You can add additional handling here if needed
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

