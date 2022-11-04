
/**
 * Assignment-07    11/2/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {

    public static void main(String[] args) {
        System.out.println("Question-01");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses inheritance to create Person, Student, Teacher, CollegeStudent classes.\n");
        
        // constructors
        Person hi = new Person("Phineas Flynn", 11);
        System.out.println(hi);
        
        Teacher hey = new Teacher("Dr Doofenshmirtz", 47, "Science", 15);
        System.out.println(hey);
        
        Student hello = new Student("Ferb Fletcher", 9, "F3RB0101", 3.3);
        System.out.println(hello);
        
        CollegeStudent hola = new CollegeStudent("Candace Flynn", 15, "ILY12345", 2.7, "Music", 1);
        System.out.println(hola);
        
        
        
        // use of getters
        // System.out.println(hi.getName());
        // System.out.println(hello.getName());
        // System.out.println(hey.getName());
        // System.out.println(hola.getName());
        
    }
}
