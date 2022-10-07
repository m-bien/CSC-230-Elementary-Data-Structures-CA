
/**
 * Assignment-04
 * 
 * Madelyn Good
 * CSC 230-02
 */

public class Book {
    
    // private fields
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    // construct default book
    Book() {
    }
    
    // construct book
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    // get name
    public String getName() {
        return name;
    }
    
    // set name
    public void setName(String name) {
        this.name = name;
    }
    
    // get author
    public Author getAuthor() {
        return author;
    }
    
    // set author
    public void setAuthor(Author author) {
        this.author = author;
    }
    
    // get price
    public double getPrice() {
        return price;
    }
    
    // set price
    public void setPrice(double price) {
        this.price = price;
    }
    
    // get quantity
    public int getQtyInStock() {
        return qtyInStock;
    }
    
    // set quantity 
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    
}
