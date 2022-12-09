package set.linkedList;

/**
 *
 * Linked list implementation of the list using a header node. Access to the list is via LinkedListIterator.
 *
 * @param <T> is the type
 * @see LinkedListIterator
 */
public class LinkedList<T> {

    private Node<T> header;
    private int size; // number of nodes

    /**
     * Construct the list
     */
    public LinkedList() {
        this.header = new Node<>(null);
        this.size = 0;
    }

    /**
     * Test if the list is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return header.next == null;
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty() {
        header.next = null;
        this.size = 0;
    }

    /**
     * Return an iterator representing the header node.
     *
     * @return a new iterator
     */
    public LinkedListIterator<T> zeroth() {
        return new LinkedListIterator<>(header);
    }

    /**
     * Return an iterator representing the first node in the list.This operation is valid for empty lists.
     *
     * @return an iterator for the first element
     */
    public LinkedListIterator<T> first() {
        return new LinkedListIterator<>(header.next);
    }

    /**
     * Insert after p.
     *
     * @param x the item to insert.
     * @param p the position prior to the newly inserted item.
     */
    public void insert(T x, LinkedListIterator<T> p) {
        if (p != null && p.current != null) {
            p.current.next = new Node<>(x, p.current.next);
            this.size++;
        }
    }

    /**
     * Return iterator corresponding to the first node containing an item.
     *
     * @param x the item to search for.
     * @return an iterator; iterator is not valid if item is not found.
     */
    public LinkedListIterator<T> find(T x) {
        Node<T> ref = header.next;

        while (ref != null && !ref.element.equals(x)) {
            ref = ref.next;
        }

        return new LinkedListIterator<>(ref);
    }

    /**
     * Return iterator prior to the first node containing an item.
     *
     * @param x the item to search for.
     * @return appropriate iterator if the item is found. Otherwise, the iterator corresponding to the last element in the list is returned.
     */
    public LinkedListIterator<T> findPrevious(T x) {
        Node<T> ref = header;

        while (ref.next != null && !ref.next.element.equals(x)) {
            ref = ref.next;
        }

        return new LinkedListIterator<>(ref);
    }

    /**
     * Remove the first occurrence of an item.
     *
     * @param x the item to remove.
     */
    public void remove(T x) {
        LinkedListIterator<T> p = findPrevious(x);

        if (p.current.next != null) {
            p.current.next = p.current.next.next;  // Bypass deleted node
            this.size--;
        }
    }

    /**
     * Return the size of the list
     *
     * @return the size
     */
    public int getSize() {
        return this.size;
    }
}
