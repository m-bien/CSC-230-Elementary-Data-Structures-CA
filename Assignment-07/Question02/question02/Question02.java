
package question02;

import animals.*;
import fruits.*;

/**
 * Assignment-07    11/3/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question02 {
    
    public static void main(String[] args) {
        System.out.println("Question-02");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses inheritance & interface to create animal and fruit classes.\n");
        
        
        // ** Sample code copied from Assignment-07.pdf **
         
        Dog lily = new Dog("Lily", 3, "Shih Tzu");
        System.out.println(lily.toString());
        System.out.println("The dog's name: " + lily.getName());
        System.out.println("The dog's age: " + lily.getAge());
        System.out.println("Dog sound: " + lily.sound());               // added line
        System.out.println();
        
        Chicken chicken = new Chicken("No Name", 4, 2);
        System.out.println(chicken.toString());
        System.out.println("The chicken's name: " + chicken.getName());
        System.out.println("The chicken's age: " + chicken.getAge());
        System.out.println("How to eat it? " + chicken.howToEat());
        System.out.println("Chicken sound: " + chicken.sound());        // added line
        System.out.println();
        
        Orange orange = new Orange("Sweet", true);
        System.out.println(orange.toString());
        System.out.println("The taste of the orange: " + orange.getTaste());
        System.out.println("How to eat it? " + orange.howToEat());
        System.out.println();
        
        Apple apple = new Apple("red", true);
        System.out.println(apple.toString());
        System.out.println("The color of the apple: " + apple.getColor());
        System.out.println("How to eat? " + apple.howToEat());
         
    }
    
}
