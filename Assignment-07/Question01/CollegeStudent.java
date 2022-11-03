
/**
 * Assignment-07
 * 
 * Madelyn Good
 * CSC 230-02
 */

// --- collegestudent is-a student ---
public class CollegeStudent extends Student {
    
    // protected fields
    protected String major;
    protected int year;
    
    // construct default collegestudent
    CollegeStudent() {
    }
    
    // construct collegestudent
    public CollegeStudent(String name, int age, String id, double gpa, String major, int year) {
        super(name, age, id, gpa);
        this.major = major;
        this.year = year;
    }
    
    // get major
    public String getMajor() {
        return major;
    }
    
    // set major
    public void setMajor(String major) {
        this.major = major;
    }
    
    // get year
    public int getYear() {
        return year;
    }
    
    // set year
    public void setYear(int year) {
        this.year = year;
    }
    
    // print results
    @Override
    public String toString() {
        return "CollegeStudent- \n Name: " + super.name + "\n Age: " + super.age +
               "\n ID: " + super.id + "\n GPA: " + super.gpa +
               "\n Major: " + major + "\n Year: " + year + "\n";
    }   
}
