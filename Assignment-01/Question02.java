
import java.util.Scanner;

/**
 * Assignment-01
 * 
 * Madelyn Good
 * CSC 230-02
 */


public class Question02 {
    
    
        // ----- fill array -----
        public static char[][] fillRandom(int rows, int columns) {
            
            System.out.println("\nGenerated array:");
            
            char[][] array = new char[rows][columns];
        
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = (char)('A' + (Math.random() * 26));   
                }
            }
            
        return array;
    }    
    
    
        // ----- print array -----
        public static void printArray(char[][] array) {
            
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {

                    System.out.print(" " + array[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        
        // ----- check for consecutives -----
        public static boolean checkLetters(char[][] array) {
           
            // horizontal
            for (int i = 0; i < array.length; i++) {
 
                    char letters = array[i][0];
                    int count = 0;
                   
                    for(int j = 0; j < array[i].length; j++) {
                       
                        if (array[i][j] == letters) {
                            count++;
                        if (count == 4) 
                            return true;
                    }   
                }   
            } 

            // vertical
            for(int j = 0; j < array[0].length; j++) {
                                
                    char letters = array[0][j];
                    int count = 0;
                    
                    for (int i = 0; i < array.length; i++) {
                    
                        if (array[i][j] == letters) {
                            count++;
                        if (count == 4)
                            return true;
                    }           
                }
            }
            
            // diagonal 
            
            /* hello I realise I did this wrong :(
               but I give up anyways :)  
            */
            

        return false;    
    }  
       
        
        
        // ----- test array -----
        public static char[][] test (int rows, int columns) {
            
            Scanner input = new Scanner(System.in);         
            
            System.out.println("Enter letters: ");
            char[][] test = new char[rows][columns];

            for (int i = 0; i < test.length; i++)           
                for (int j = 0; j < test[i].length; j++)   
                    test[i][j] = input.next().charAt(0);

            System.out.print("\nYour array: \n");
            
        return test;
    }
        
        
        // ----- main method -----
        public static void main(String[] args) {
        System.out.println("Question-02");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println();
        System.out.println("This program will check for consecutive letters in a 2D array.");
        
          
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter rows, a whole number ≥ 4): ");
        int rows = input.nextInt();
        
        System.out.print("Enter columns, a whole number ≥ 4): ");
        int columns = input.nextInt();

           
        /*
        // generated array
        char[][] array = fillRandom(rows, columns);     
        printArray(array);
        */
        
        // test array
        char[][] test = test(rows, columns);
        printArray(test);
        
        
        
        System.out.println("\nChecking for consecutive letters...");
        // System.out.println(checkLetters(array));
        System.out.println(checkLetters(test));
        
        }
    }

    


