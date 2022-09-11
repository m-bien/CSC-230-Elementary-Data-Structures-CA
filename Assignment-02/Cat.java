/**
 * Assignment-02 
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Cat {
    
    // private fields
    private String name;
    private String dob;
    private Color color;
    private boolean status;
    private int distanceFromHome;
    
    // construct default cat
    Cat() {    
    }
    
    // construct cat 
    public Cat(String name, String dob, Color color, boolean status, int distanceFromHome) {
        this.name = name;
	this.dob = dob;
        this.color = color;
        this.status = status;
        this.distanceFromHome = distanceFromHome;
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
    public String getDob() {
        return dob;
    }
    
    // set dob
    public void setDob(String dob) {
        this.dob = dob;    
    }
    
    // get color
    public Color getColor() {
        return color;
    }
    
    // set color
    public void setColor(Color color) {
        this.color = color;
    }
    
    // get status
    public boolean getStatus() {
        return status;
    }
    
    // set status
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    // get distance
    public int getDistanceFromHome() {
        return distanceFromHome;
    }
    
    // set distance
    public void setDistanceFromHome(int distanceFromHome) {
        this.distanceFromHome = distanceFromHome;
    }  
    
    
}