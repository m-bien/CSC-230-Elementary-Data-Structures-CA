
/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- super class ---
public class Person {
    
    // protected fields
    protected String name;
    protected int age;
    
    // construct default person
    Person() {
    }
    
    // construct person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
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
        return "Person- \n Name: " + name + "\n Age: " + age + "\n";
        //return "Person{name=" + name + ", age=" + age +"}";
    }
}
