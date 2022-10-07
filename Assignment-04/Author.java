
import java.util.*;

/**
 * Assignment-04
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Author {
    
    // private fields
    private String name;
    private Date dob;
    private String email;
    
    // construct default author
    Author() {   
    }
    
    // construct author
    public Author(String name, Date dob, String email) { 
        this.name = name;
        this.dob = dob;
        this.email = email;    
    }
    
    // get name
    public String getName() {
        return name;
    }
    
    // set name
    public void setName(String name) {
        this.name = name;
    }
    
    // get dob
    public Date getDob() {
        return dob;
    }
    
    // set dob
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    // get email
    public String getEmail() {
        return email;
    }
    
    // set email
    public void setEmail(String email) {
        this.email = email;
    }
  
}
