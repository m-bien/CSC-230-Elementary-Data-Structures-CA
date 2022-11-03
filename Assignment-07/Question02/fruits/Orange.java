
package fruits;

import common.Edible;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Orange extends Fruit {
    
    // private field
    private String taste;
    
    // construct default orange
    Orange() {
    }
    
    // construct orange
    public Orange(String taste, boolean riped) {
        super(riped);
        this.taste = taste;    
    }
    
    // get taste
    public String getTaste() {
        return taste;
    }
    
    // set taste
    public void setTaste(String taste) {
        this.taste = taste;
    }
    
    // print results
    @Override
    public String toString() {
        return "Orange{taste=" + taste + ", riped=" + super.riped + "}";
    }
    
    // print edible
    @Override
    public String howToEat() {
        return "Make sure to peel before you eat!!!";
    }
    
}

