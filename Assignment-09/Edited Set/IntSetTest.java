
package set;

/**
 * Assignment-09    12/4/22
 * 
 * Jacob Crews      Section 1
 * Madelyn Good     Section 2
 * Ro Mei           Section 2
 * Jowuan Williams  Section 2
 */

// ----- main method -----
public class IntSetTest {

    public static void main(String[] args) {
        System.out.println("Jacob Crews");
        System.out.println("Madelyn Good");
        System.out.println("Ro Mei");
        System.out.println("Jowuan Williams\n");
        
        System.out.println("TEST CASES:\n");
        
        // thank you CA for great semester :)
        // enjoy winter break happy holidays !!
  
        
        // *** TEST CASES ***
        
        // SetA = {1, 2, 5}
        IntSet setA = new IntSet();
        setA.insert(1);
        setA.insert(2);
        setA.insert(5);

        System.out.print("Set A: ");
        setA.print();

        // SetB = {2, 3, 1, 5}
        IntSet setB = new IntSet();
        setB.insert(2);
        setB.insert(3);
        setB.insert(1);
        setB.insert(5);

        System.out.print("Set B: ");
        setB.print();

        System.out.println();

        // contains() test
        System.out.println("Set A contains '5': " + setA.contains(5));
        System.out.println("Set B contains '7': " + setB.contains(7));

        System.out.println();

        // union() test
        var union = setA.union(setB);
        System.out.print("SetA Union SetB: ");
        union.print();

        // intersection() test
        var intersection = setA.intersection(setB);
        System.out.print("SetA Intersection SetB: ");
        intersection.print();

        System.out.println();

        // comparable() test
        System.out.println("SetA == SetB: " + setA.comparable(setB));

        System.out.println();

        // cardinality() test
        System.out.println("SetA Cardinality: " + setA.getCardinality());
        System.out.println("SetB Cardinality: " + setB.getCardinality());

    }
}
