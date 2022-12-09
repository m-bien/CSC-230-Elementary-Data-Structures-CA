import java.util.*;

/**
 * Assignment-08    11/23/22
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Question01 {
    
    // ** methods referenced from lecture & textbook **
    
    // ----- bubble sort -----
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
         
        boolean swapped = true;
        int last = array.length;

        while (swapped) {
            swapped = false;

            for (int i = 1; i < last; i++) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    T temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
            last--;
        }
    }
    
    
    // ----- selection sort -----
    public static <T extends Comparable<T>> void selectionSort(T[] array) {
        
        int marker = array.length;
        
        for (int i = 0; i < marker; i++) {
            int minIndex = i;
            for (int j = i + 1; j < marker; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            
            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;   
        } 
    }
    
    
    // ----- insertion sort -----
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        
        for (int i = 1; i < array.length; i++) {
            T current = array[i];
            int j = i - 1;
            while (j >= 0 && current.compareTo(array[j]) < 0) {
                T temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }
        
    
    // ----- quick sort -----
    public static <T extends Comparable<T>> void quickSort(T[] array, int left, int right) {
        
        Random RAND = new Random();
        
        if (left < right) {
            int randomPivot = (int)(left + RAND.nextInt(right - left));
            T temp = array[randomPivot];
            array[randomPivot] = array[right];
            array[right] = temp;
            
            int q = partition(array, left, right);  // q = calls partition, gets pivot
            quickSort(array, left, q - 1);
            quickSort(array, q + 1, right);
        } 
    }
    
    public static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        
        T pivot = array[right]; 
        int i = left - 1;       // i = left side of far right element
        
        for (int j = left; j < right; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        T temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        
        return i + 1;
    }

    
    
    // ***** main method *****
    public static void main(String[] args) {
        System.out.println("Question-01");
        System.out.println("Madelyn Good");
        System.out.println("CSC 230-02");
        System.out.println("\nThis program uses the \"better\" bubble sort, selection sort,");
        System.out.println("   insertion sort, and quick sort algorithms to sort arrays of type T.");
        
        
        // --- test integer ---
        Integer[] a1 = {10, 5, 56, 67, 4, 59, 13};
        
        System.out.println("\n+---------------- INTEGER ----------------+");
        System.out.println(" Unsorted: " + Arrays.toString(a1));
        System.out.println("\n Sorted:");
        
        bubbleSort(a1);
        System.out.println("   Bubble: " + Arrays.toString(a1));
        
        selectionSort(a1);
        System.out.println("   Selection: " + Arrays.toString(a1));
        
        insertionSort(a1);
        System.out.println("   Insertion: " + Arrays.toString(a1));
                
        quickSort(a1, 0, a1.length - 1);
        System.out.println("   Quick: " + Arrays.toString(a1));
        
        
        // --- test circle ---
        Circle[] a2 = {new Circle(20), new Circle(3), new Circle(15), new Circle(45), new Circle(20), new Circle(10)};
        
        System.out.println("\n+----------------- CIRCLE -----------------+");
        System.out.println(" Unsorted: " + Arrays.toString(a2));
        System.out.println("\n Sorted:");
        
        bubbleSort(a2);
        System.out.println("   Bubble: " + Arrays.toString(a2));
        
        selectionSort(a2);
        System.out.println("   Selection: " + Arrays.toString(a2));
        
        insertionSort(a2);
        System.out.println("   Insertion: " + Arrays.toString(a2));
                
        quickSort(a2, 0, a2.length - 1);
        System.out.println("   Quick: " + Arrays.toString(a2));
        
    }
    
}
