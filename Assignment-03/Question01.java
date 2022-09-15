package Question01;

import java.util.*;

/**
 * Assignment-03
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {
    
        // ----- user input -----
        public static String[] getStrings() {
            Scanner scanner = new Scanner(System.in);
            String[] unlimited = new String[0];
            String input;
            
            System.out.println("Enter unlimited values, to quit press enter: "); 

           do {
                input = scanner.nextLine();
                if (input.length() == 0) {
                    break;
                }
                // call resize method to fit unlimited # of input
                unlimited = resize(unlimited, unlimited.length + 1);
                unlimited[unlimited.length - 1] = input;
                
            } while (input.length() != 0);
            
        return unlimited;
    }
        
        
        // ----- resize array -----
            /**
             * @param array = input that needs resizing
             * @param newSize = size of new array
             * @return = new array with +1 slot
             */
        public static String[] resize(String[] array, int newSize) {
            String[] newArray = new String[newSize];
            
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            
        return newArray;    
    }
        
        
        // ----- main method -----
        public static void main(String[] args) {
            System.out.println("Question-01");
            System.out.println("Madelyn Good");
            System.out.println("CSC 230-02");
            System.out.println();
            System.out.println("This program will read unlimited input of strings and store them in an array.\n");

            
            // print array
            String[] input = getStrings();

            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i] + " ");
            }

            System.out.println();
            
        }
        
    }

    

