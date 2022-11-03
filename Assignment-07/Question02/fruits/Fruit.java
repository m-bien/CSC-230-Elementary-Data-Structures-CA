
package fruits;

import common.Edible;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- super fruit ---
public abstract class Fruit implements Edible {
    
    // protected field
    protected boolean riped;
    
    // construct default fruit
    Fruit() {
    }
    
    // construct fruit
    protected Fruit(boolean riped) {
        this.riped = riped;
    }
    
    // get riped
    public boolean isRiped() {
        return riped;
    }
    
    // set riped
    public void setRiped(boolean riped) {
        this.riped = riped;   
    }
    
    // print results
    @Override
    public String toString() {
        return "Fruit{riped=" + riped + "}";
    }
 
}
