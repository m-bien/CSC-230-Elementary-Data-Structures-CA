import java.util.*;

/**
 * Assignment-02 
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
        System.out.println("This program creates and uses a class to abstract a Cat named Tom.\n");
        
        // create object of Cat
        Cat cat1 = new Cat();
        
        // specify cat amazingness
        cat1.setName("Tom");
        cat1.setDob("September 5");
        cat1.setColor(Color.black);
        cat1.setStatus(false);
        cat1.setDistanceFromHome(2);
        
        // access amazingness
        System.out.println("Name: " + cat1.getName());
        System.out.println("Date of Birth: " + cat1.getDob());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Sleeping? " + cat1.getStatus());
        System.out.println("Distance from Home: " + cat1.getDistanceFromHome()); 
    }
    
}