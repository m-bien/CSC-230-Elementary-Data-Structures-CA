package Question02;

import java.util.*;

/**
 * Assignment-03    9/14/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question02 {
    
    public static int secondMax(int[] array) {
        
        int max = array[0];
        int secondMax = array[0];
        
        // find
        for (int i = 0; i < array.length; i++) {
            
            if (array.length < 2) {
                System.out.println();
                throw new IllegalArgumentException("Error! No second max for arrays of size less than 2!");
            }/*
            if () {
                System.out.println(I give up);
                throw new IllegalArgumentException("Error! No second max for arrays with all the same numbers!");
            }*/
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } 
            if (array[i] > secondMax && array[i] < max) {
                    secondMax = array[i];
            }   
        }

        return secondMax;    
    }
       
 
    // ----- main method -----
    public static void main(String[] args) {
        System.out.println("Question-02");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println();
        System.out.println("This program will return the second maximum of an integer array.\n");
        
        
        // test cases
        int array1[] = {1};
        int array2[] = {1, 1, 1, 1, 1};
        int array3[] = {1, 2, 3, 3, 4, 1, 10};
        int array4[] = {99, 37, 102, 51, 74, 86, 23};
        
        
        // print array
        System.out.println("The array is: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("\n\nThe second maximum number is: " + secondMax(array3));
        
    }  
}
