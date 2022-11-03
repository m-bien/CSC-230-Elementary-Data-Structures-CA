
package animals;

import common.Edible;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- chicken is-a animal ---
public class Chicken extends Animal implements Edible {
    
    // private field
    private double weight;
    
    // construct default chicken
    Chicken() {
    }
    
    // construct chicken
    public Chicken(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }
    
    // get weight
    public double getWeight() {
        return weight;
    }
    
    // set weight
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // print results
    @Override
    public String toString() {
        return "Chicken{name=" + super.name + ", age=" + super.age +
               ", weight=" + weight + "}";
    }
    
    // print edible
    @Override
    public String howToEat() {
        return "Fried or curry :-)!!!";
    }
    
    // print sound
    @Override
    public String sound() {
        return "cock-a-doodle-doo";
    }
    
}
