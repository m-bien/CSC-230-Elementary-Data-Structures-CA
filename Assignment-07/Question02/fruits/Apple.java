
package fruits;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- apple is-a fruit ---
public class Apple extends Fruit {
    
    // private field
    private String color;
    
    // construct default apple
    Apple() {
    }
    
    // construct apple
    public Apple(String color, boolean riped) {
        super(riped);
        this.color = color;
    }
    
    // get color
    public String getColor() {
        return color;
    }
    
    // set color
    public void setColor(String color) {
        this.color = color;
    }
    
    // print results
    @Override
    public String toString() {
        return "Apple{color=" + color + ", riped=" + super.riped + "}";
    }
    
    // print edible
    @Override
    public String howToEat() {
        return "You can eat raw!!";
    }
    
}
