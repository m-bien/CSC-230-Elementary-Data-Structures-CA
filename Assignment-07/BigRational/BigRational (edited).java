package bigrationaltest;

/** 
 * Madelyn Good     11/12/22
 * 
 * Exam II
 * CSC 230-02
 */

import java.math.BigInteger;

/**
 * This class represents rational numbers. A rational number stores a numerator
 * and denominator, and we will use BigIntegers to represent the numerator and
 * denominator. Thus our class will be aptly named BigRational
 *
 * Following concepts haven used. public static final constants use of an
 * existing class, namely BigInteger (composition) multiple constructors
 * throwing exceptions implementing a set of accessors implementing equals and
 * toString
 */
public class BigRational implements Comparable<BigRational> {
    
    // --- final constants ---
    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");
    
    // --- private fields ---
    private BigInteger num; // only this can be negative
    private BigInteger den; // never negative
    //private boolean indeterminate = false;
    
    // -- construct default big rational ---
    public BigRational() {
        this(BigInteger.ZERO);
    }
    
    // --- construct big rational ---
    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }
    
    // --- big rational helper ---
    // --- MODIFIED so 0/0 is legal ?? ---
    public BigRational(BigInteger num, BigInteger den) {
        this.num = num;
        this.den = den;
        
        //if (!(this.num.equals(BigInteger.ZERO) && this.den.equals(BigInteger.ZERO))) {
            check00();
            fixSigns();           // if none of these work = indeterminate 
            reduce();             // I'm confused
        //} else {
            //this.indeterminate = true;
        //}    
    }

    // --- get str value after last '/' ---  
    public BigRational(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("empty string");
        }

        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {               
            num = new BigInteger(str.trim());
            den = BigInteger.ONE; // den = 1
        } else {
            num = new BigInteger(str.substring(0, slashIndex).trim());
            den = new BigInteger(str.substring(slashIndex + 1).trim());
            try {                 
                check00();        // added try catch
                fixSigns();
                reduce();
            } catch (ArithmeticException e) {
   
            }
        }
    }
    
    // --- illegal if 0/0 ---
    // --- MODIFIED so 0/0 is legal ?? ---
    private void check00() {
        if (num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("division by zero");
            //this.indeterminate = true;
        }
    }

    // --- negate negative ---
    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }
    
    // --- simplify number ---
    private void reduce() {
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);

    }
    // --- absolute value ---
    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }
    
    // --- negate number ---
    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }
    
    // --- add numbers ---
    public BigRational add(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den).add(other.num.multiply(this.den));
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }
    
    // --- subtract numbers ---
    public BigRational subtract(BigRational other) {
        return add(other.negate());
    }
    
    // --- multiply numbers ---
    public BigRational multiply(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.num);
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }
    
    // --- divide numbers ---
    public BigRational divide(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den);
        BigInteger newDenominator = this.den.multiply(other.num);
        return new BigRational(newNumerator, newDenominator);
    }
    
    // --- print results based on if equal ---
    @Override
    public boolean equals(Object other) {
        if (other instanceof BigRational) {
            BigRational rhs = ((BigRational) other);
            return num.equals(rhs.num) && den.equals(((BigRational) other).den);
        }
        return false;
    }
   
    // --- print results based on num & den ---
    // --- MODIFIED so 0/0 is "indeterminate" ---
    @Override
    public String toString() {
        if (den.equals(BigInteger.ZERO)) {                      // den = 0
            if (num.compareTo(BigInteger.ZERO) < 0) {           // num is negative           
                return "-Infinity";                   
            } else if (num.compareTo(BigInteger.ZERO) > 0) {    // num is > 0  
                return "Infinity";                    
            } else {                                            // num & den = 0
                return "Indeterminate";      
            }
        }

        if (den.equals(BigInteger.ONE)) {                       // den = 1
            return num.toString();
        } else {                                                // num & den ≠ 0              
            return num + " / " + den;
        }
    }
    
  
    // *** NEW METHODS ***
    
    // --- pow numbers ---
    public BigRational pow(int exp) {       
        if (exp < 0) {
            throw new ArithmeticException("Exponent is negative");
        }
        BigInteger newNumerator = this.num.pow(exp);
        BigInteger newDenominator = this.den.pow(exp);
        return new BigRational(newNumerator, newDenominator);
    }
    
    // --- inverse numbers --- 
    public BigRational reciprocal() {
        return new BigRational(den, num); // flip num & den
    }
    
    // --- convert BigRational to BigInteger ---
    public BigInteger toBigInteger() {
        if (!den.equals(BigInteger.ONE)) {
            throw new ArithmeticException("Not an integer value"); 
        }
        return num; // BigInteger
    }
    
    // --- convert BigInteger to Integer ---
    public int toInteger() {
        if (!den.equals(BigInteger.ONE)) {
            throw new ArithmeticException("Not an integer value"); 
        }
        return num.intValue(); // Integer
    }
    
    // --- compare BigRational ---
    // *method incorrect, output is wrong
    @Override
    public int compareTo(BigRational obj) {
        BigInteger newNumerator = this.num.multiply(obj.den);   // num * den = LCM
        BigInteger newDenominator = obj.num.multiply(this.den);
        return newNumerator.compareTo(newDenominator);
        
    }
}
    
