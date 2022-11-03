
package animals;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- dog is-a animal ---
public class Dog extends Animal {
    
    // private field
    private String breed;
    
    // construct default dog
    Dog() {
    }
    
    // construct dog
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    // get breed
    public String getBreed() {
        return breed;
    }
    
    // set breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    // sound
//    public void sound() {
//        
//    }
    
    // print results
    @Override
    public String toString() {
        return "Dog{name=" + super.name + ", age=" + super.age +
               ", breed=" + breed + "}";
    }
    
    // print sound
    @Override
    public String sound() {
        return "woof";
    }
    
}
