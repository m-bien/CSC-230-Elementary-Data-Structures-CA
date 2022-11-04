
import java.util.*;

/**
 * Assignment-04    9/26/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {

    public static void main(String[] args) {
        System.out.println("Question-01");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println();
        System.out.println("This program uses aggregation to create Author and Book classes.\n");
        
        
        // ** Sample code copied from Assignment-04.pdf **
        
        
        // Date constructor will give you a deprecated warning but do not worry about it now.
        Author sipser = new Author("Michael Siper", new Date("10/14/1964"), "sipser@gmail.com");
        Book itc = new Book("Introduction to the Theory of Computation", sipser, 112.50, 23);
        Book foc = new Book("Fundamental of Computer Science", sipser, 117.49, 14);
        
        // Use of getters
        System.out.println(itc.getName());
        System.out.println(itc.getAuthor().getName());
        System.out.println(itc.getAuthor().getDob());
        System.out.println(itc.getAuthor().getEmail());
        System.out.println(itc.getPrice());
        System.out.println(itc.getQtyInStock());
        System.out.println();
        
        // Use of getters
        System.out.println(foc.getName());
        System.out.println(foc.getAuthor().getName());
        System.out.println(foc.getAuthor().getDob());
        System.out.println(foc.getAuthor().getEmail());
        System.out.println(foc.getPrice());
        System.out.println(foc.getQtyInStock());
        System.out.println();
        
        // Some sample setter usage and their output
        itc.setQtyInStock(100);
        foc.setQtyInStock(45);
        System.out.println(itc.getQtyInStock());
        System.out.println(foc.getQtyInStock());
    }
    
}
