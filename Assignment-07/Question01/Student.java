
/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- student is-a person ---
public class Student extends Person {
    
    // protected fields
    protected String id;
    protected double gpa;
    
    // construct default student
    Student() {
    }
    
    // construct student
    public Student(String name, int age, String id, double gpa) {
        super(name, age);
        this.id = id;
        this.gpa = gpa;
    }
    
    // get id
    public String getId() {
        return id;
    }
    
    // set id
    public void setId(String id) {
        this.id = id;
    }
    
    // get gpa
    public double getGpa() {
        return gpa;
    }
    
    // set gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    // print results
    @Override
    public String toString() {
        return "Student- \n Name: " + super.name + "\n Age: " + super.age + 
               "\n ID: " + id + "\n GPA: " + gpa + "\n";
    }  
}
