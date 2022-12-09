
package set;

/**
 * Goals: 
 *  - Edit and improve the provided code
 *  - Convert provided array into linked list
 *  - Make sure any type of element can be held
 *  - Make sure IntSet is iterable using enhanced for-loop
 * =======================================================
 * Edits:
 *  - Added class Node
 *  - Converted all provided methods
 *  - Deleted IntSet(int maxSize) method
 *  - var keyword: compiler determines type
 *  - Main method test cases
 *  - Added Node methods, isExists, Comparable methods
 *  - Improved and added documentation
 *  - Ton of other stuff we lost track of
 *  -
 *  - 
 */

// --- linked list elements ---
public class IntSet {
    
    // element variables
    private int cardinality;
    public Node firstElement;
    public Node lastElement;
    

    // --- linked list node ---
    private class Node {

        // node variables 
        private int value;
        private Node next;

        // construct node
        public Node(int value) {
            this.value = value;
        }
    }
    
    
    // *** METHODS ***

    // --- insert element ---
    public void insert(int newElement) throws SetException{
        
        cardinality++;
        var node = new Node(newElement);
        
        if(isEmpty())
            firstElement = lastElement = node;
        else
            lastElement.next = node;
            lastElement = node;
    }


    // --- find union ---
    public IntSet union(IntSet set) throws SetException{
        
        IntSet union = new IntSet();
        var tempSet = firstElement;
        var currentSet = set.firstElement;
        
        // insert tempSet 
        while(tempSet != null){
            union.insert(tempSet.value);
            tempSet = tempSet.next;
        }
        
        // insert currentSet 
        while(currentSet != null) {
            if(!isExist(firstElement, currentSet.value))
                union.insert(currentSet.value);
            currentSet = currentSet.next;
        }
        return union;
    }

    // --- find intersection ---
    public IntSet intersection(IntSet set)throws SetException{
        
        IntSet intersection = new IntSet();
        var tempSet = firstElement;
        var currentSet = set.firstElement;
        
        while(tempSet != null){                         // traverse tempSet
            if(isExist(currentSet, tempSet.value))      // search if element in currentSet
                intersection.insert(tempSet.value);     // if found, insert element
            tempSet = tempSet.next;
        }
        return intersection;
    }

    // --- compare sets, check if equal/contain same element ---
    public boolean comparable(IntSet set) throws SetException{
        
        var tempSet = firstElement;
        var currentSet = set.firstElement;
        int iterator = 0;

        if(this.cardinality == set.getCardinality()){
            while(tempSet != null){
                if(tempSet.value == currentSet.value){
                    tempSet = tempSet.next;
                    currentSet = set.firstElement;
                }
                else{
                    if(iterator == this.cardinality)
                        return false;
                    currentSet = currentSet.next;
                    iterator++;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    // --- check if empty ---
    public boolean isEmpty(){
        return firstElement == null;
    }

    // --- get cardinality ---
    public int getCardinality(){
        return this.cardinality;
    }

    // --- check if element exists ---
    public boolean contains(int testElement){
        var contain = firstElement;
        while(contain != null){
            if(contain.value == testElement)
                return true;
            contain = contain.next;
        }
        return false;
    }

    // --- check if node exists ---
    public boolean isExist(Node tempNode, int value)
    {
        Node temp = tempNode;
        while (temp != null) {
            if (temp.value == value)
                return true;
            temp = temp.next;
        }
        return false;
    }
    
    // --- remove all elements ---
    public void clear() {
        firstElement = null;
    }

    // --- print results ---
    public void print(){
        if(isEmpty()){
            System.out.println("Set is empty...!");
        }
        else {
            var node = firstElement;
            while (node != null) {
                System.out.print(node.value + " ");
                node = node.next;
            }
        }
        System.out.println();
    }
}
