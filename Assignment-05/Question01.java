
import java.util.*;

/**
 * Assignment-05    10/7/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {
    
    // ** methods referenced from textbook **
    
    // ----- palindrome -----
    public static boolean checkPalindrome(String word) {
        
        int low = 0;
        int high = word.length() - 1;
        
        while (low < high) {
            
            if (word.charAt(low) != word.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    
    
    // ----- binary search -----
    public static int binarySearch(int[] array, int key) {
        
        int low = 0;
        int high = array.length - 1;
        
        while (high >= low) {

            int mid = (low + high) / 2;

            if (key < array[mid])
                high = mid - 1;
            else if (key == array[mid])
                return mid;
            else
                low = mid + 1;                     
        }
        return -1;
    }
    
    
    // ----- great common divisor -----
    public static int findGcd(int num1, int num2) {
        
        int gcd = 1; 
        
        for (int i = 2; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;    
        }
        return gcd;
    }
    
    
    // ***** main method *****
    public static void main(String[] args) {
        System.out.println("Question-01");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program has 3 methods: palindrome, binary search, and greatest common divisor.");
        
        Scanner scanner = new Scanner(System.in);
        
        // variables
        char choice;
        int[] array = {12, 2, 8, 5, 9, 1, 4, 7, 11, 3, 6, 10};
        int key;
        int search;
        String word;
        boolean racecar = true;
        int num1;
        int num2;
        int gcd;
        
        // menu & switch referenced from kikuchi
        do {
            System.out.println("\n+------------------------------------------------+");
            System.out.println("| Menu: \t\t\t\t\t |");
            System.out.println("| A - Determine if string is a palindrome \t |");
            System.out.println("| B - Find number using binary search \t\t |");
            System.out.println("| C - Calculate GCD of two positive numbers \t |");
            System.out.println("| D - Quit \t\t\t\t\t |");
            System.out.println("+------------------------------------------------+");
            
            System.out.print("Enter your menu choice, A, B, C, or D: ");
            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
            
            switch(choice) {
                case 'A':
                    System.out.print("Enter a word: ");
                    word = scanner.next();
                    racecar = checkPalindrome(word.toLowerCase());
                    
                    if (racecar)
                        System.out.println(word + " is a palindrome");
                    else
                        System.out.println(word + " is not a palindrome");
                    break;
                // ------    
                case 'B':
                    Arrays.sort(array);
                    System.out.println("The array is: " + Arrays.toString(array));

                    System.out.print("Enter number to find: ");
                    key = scanner.nextInt();    
                    search = binarySearch(array, key);
                    
                    if (search >= 0)
                        System.out.println(key + " is found at index " + search);
                    else
                        System.out.println(key + " not found");  
                    break;
                // ------    
                case 'C':
                    System.out.print("Enter first positive integer: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second positive integer: ");
                    num2 = scanner.nextInt();
                    gcd = findGcd(num1, num2);
                    
                    if (num1 < 0 || num2 < 0)
                        throw new IllegalArgumentException("Input must be positive!");
                    else
                        System.out.println("The GCD is " + gcd);
                    break;
                // ------    
                case 'D':
                    System.out.print("Thanks for using my program!\n");
                    break;
                default:
                    System.out.print("Invalid letter\n");
                    break;
            }  
        } while (choice != 'D');           
    } 
}        
     
    
    

