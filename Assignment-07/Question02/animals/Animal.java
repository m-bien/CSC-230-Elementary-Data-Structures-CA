
package animals;

/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- super animal ---
public abstract class Animal {
    
    // protected fields
    protected String name;
    protected int age;
    
    // construct default animal
    Animal() {
    }
    
    // construct animal
    protected Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // sound
    //protected void sound() {
    public abstract String sound();
        
    
    
    // get name
    public String getName() {
        return name;
    }
    
    // set name
    public void setName(String name) {
        this.name = name;
    }
    
    // get age
    public int getAge() {
        return age;
    }
    
    // set age
    public void setAge(int age) {
        this.age = age;
    }
    
    // print results
    @Override
    public String toString() {
        return "Animal{name=" + name + ", age=" + age + "}";
    }
    
}
