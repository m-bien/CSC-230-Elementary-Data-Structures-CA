
import java.util.*;

/**
 * Assignment-06    10/22/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question03 {

    // ----- string -----
    public static String reverse1(String s) {
        
        if(s.length() == 0)
            return s;
        else
            return reverse1(s.substring(1)) + s.charAt(0);
        
    }
    /*
    private static String reverse(String s, int position, String result) {
        
    }
    */ 
    
    // bajillion kazjillion trial and errors I give up   
    
    
    // ----- string buffer -----
    public static String reverse2(String s) {
        
        StringBuffer sb = new StringBuffer();
        reverse(s, s.length() - 1, sb);
        
        return sb.toString();    
    }
    
    private static StringBuffer reverse(String s, int position, StringBuffer sb) {
        
        if (position < 0)
            return sb;
        else
            sb.append(s.charAt(position));
        
        return reverse(s, position - 1, sb);    
    }
       
    
    // ----- main method -----
    public static void main(String[] args) {
        System.out.println("Question-03");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses recursion to reverse a string.");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter a string: ");
        String str = scanner.nextLine();
        
        System.out.println(str + " reversed is: " + reverse1(str));
        System.out.println(str + " reversed is: " + reverse2(str));
    }
}
