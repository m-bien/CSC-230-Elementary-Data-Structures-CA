
import java.util.*;

/**
 * Assignment-06
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question02 {

    public static int reverse(int number) {

        if (number < 10) {
            return number;
        } else {
            System.out.print(number % 10);  // print each digit
        }
        return reverse(number / 10);        // return remaining digits
    }

    
    public static void main(String[] args) {
        System.out.println("Question-02");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses recursion to reverse a positive integer.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a positive number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new IllegalArgumentException("Input must be positive!");
        } else {
            System.out.print("The reverse of " + number + " is ");
        }
        System.out.print(reverse(number) + "\n");
    }
}
