
import java.util.*;

/**
 * Assignment-06
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {

    public static int length(String str) {

        if ("".equals(str)) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    
    public static void main(String[] args) {
        System.out.println("Question-01");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses recursion to find the length of a string.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter a string: ");
        String str = scanner.nextLine();

        System.out.println("The length of " + str + " is " + length(str));

    }
}
