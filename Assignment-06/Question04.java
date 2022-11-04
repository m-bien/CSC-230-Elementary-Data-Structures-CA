
import java.util.*;

/**
 * Assignment-06    10/22/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question04 {
    
    // ----- normal fib -----
    public static int fib_bad(int nth) {
        
        if (nth == 0) {
            return 0;
        } else if (nth == 1)
            return 1;
        else
            return fib_bad(nth - 1) + fib_bad(nth - 2);   
    }
    
    
    // ----- array fib -----
    public static int fib_good(int nth) {
        
        int[] save = new int[50];
        
        if (nth <= 1) {
            return save[nth]= nth;
        } else if (save[nth] != 0)
            return save[nth];
        else
            return save[nth] = fib_good(nth - 1) + fib_good(nth - 2);
    }
    
    
    // ----- main method -----
    public static void main(String[] args) {
        System.out.println("Question-04");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses two recursion approaches to calculate n-th Fibonacci number.");
            
        int nth = 41;   
        
        System.out.println("\nIndex to find: " + nth);
        System.out.println("Computing...\n");
        
        System.out.println("fib_bad at index " + nth + " is " + fib_bad(nth));
        System.out.println("fib_good at index " + nth + " is " + fib_good(nth)); 
        
    }
}
