
/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- teacher is-a person ---
public class Teacher extends Person {
    
    // protected fields
    protected String subject;
    protected double salary;
    
    // construct default teacher
    Teacher() {
    }
    
    // construct teacher
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }
    
    // get subject
    public String getSubject() {
        return subject;
    }
    
    // set subject
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    // get salary
    public double getSalary() {
        return salary;
    }
    
    // set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // print results
    @Override
    public String toString() {
        return "Teacher- \n Name: " + super.name + "\n Age: " + super.age +
               "\n Subject: " + subject + "\n Salary: $" + salary + "\n";
    }  
}
