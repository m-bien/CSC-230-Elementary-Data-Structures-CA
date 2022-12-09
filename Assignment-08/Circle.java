
/**
 * Assignment-08    11/23/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

/** default circle for Question01 - Question04
 *  implements comparable for the circle objects
 */ 
public class Circle implements Comparable<Circle> {
    
    // private field
    private int radius;
    
    // construct default circle
    Circle() {
    }
    
    // construct circle
    public Circle(int radius) {
        this.radius = radius;
    }
    
    // get radius
    public int getRadius() {
        return radius;
    }
    
    // set radius
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    // print results
    @Override
    public String toString() {
        return "" + radius;
    }
    
    // compare circle
    @Override
    public int compareTo(Circle obj) {
        return this.radius - obj.getRadius();
    }
}
        
