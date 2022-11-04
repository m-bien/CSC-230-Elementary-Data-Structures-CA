import java.util.Scanner;

/**
 * Assignment-01    8/29/22
 * 
 * Madelyn Good
 * CSC 230-02
 */


/**
 * Divide the first (1/4th) quadrant in to small rectangles of width of your
 * choice (smaller the better). Calculate the width of the rectangles, and add
 * these areas to approximate the area of the first quadrant. Multiplying that
 * value by 4 gives the approximate area of the entire circle.
 */


public class Question01 {
    
    
        // ----- approximate area -----
        public static double approxCircleArea(double radius, double numOfRectangles) {

            double x = 0.0;
            double area = 0.0;
            double dx = (radius / numOfRectangles);
            
            while (x < radius - dx) {
                area = area + (dx * Math.sqrt((radius * radius) - ( x * x)));
                x = x + dx;   
            }
            
        return area * 4;                   
    }
        

        // ----- exact area -----
        public static double exactCircleArea() {           
     
            double radius = 0.001;    
            double PI = 3.14159;
 
        return PI * radius * radius;
    }
        
        
        // ----- main method -----
        public static void main(String[] args) {
            System.out.println("Question-01");
            System.out.println("Madelyn Good");
            System.out.println("CSC 230-02");
            System.out.println();
            System.out.println("This program will approximate the area of a circle centered at origin with radius r.");


            // approximate area
            System.out.println("\nThe approximate area with 50 rectangles is: " + approxCircleArea(0.001,50));
            System.out.println("The approximate area with 500 rectangles is: " + approxCircleArea(0.001,500));
            System.out.println("The approximate area with 5000 rectangles is: " + approxCircleArea(0.001,5000));


            // exact area
            System.out.println("\nThe exact area with radius 0.001 is: " + exactCircleArea()); 
        
        }          
    }
