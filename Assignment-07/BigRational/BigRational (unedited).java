package bigrationaltest;

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
public class BigRational {

    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");

    private BigInteger num; // only this can be nagative
    private BigInteger den; // never negative

    public BigRational() {
        this(BigInteger.ZERO);
    }

    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    public BigRational(BigInteger num, BigInteger den) {
        this.num = num;
        this.den = den;
        check00();
        fixSigns();
        reduce();
    }

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
            check00();
            fixSigns();
            reduce();
        }
    }

    private void check00() {
        if (num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO)) {
            throw new ArithmeticException("division by zero");
        }
    }

    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);

    }

    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }

    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }

    public BigRational add(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den).add(other.num.multiply(this.den));
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }

    public BigRational subtract(BigRational other) {
        return add(other.negate());
    }

    public BigRational multiply(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.num);
        BigInteger newDenominator = this.den.multiply(other.den);
        return new BigRational(newNumerator, newDenominator);
    }

    public BigRational divide(BigRational other) {
        BigInteger newNumerator = this.num.multiply(other.den);
        BigInteger newDenominator = this.den.multiply(other.num);
        return new BigRational(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof BigRational) {
            BigRational rhs = ((BigRational) other);
            return num.equals(rhs.num) && den.equals(((BigRational) other).den);
        }
        return false;
    }

    @Override
    public String toString() {
        if (den.equals(BigInteger.ZERO)) {
            if (num.compareTo(BigInteger.ZERO) < 0) {
                return "-Infinity";
            } else {
                return "Infinity";
            }
        }

        if (den.equals(BigInteger.ONE)) {
            return num.toString();
        } else {
            return num + " / " + den;
        }
    }
}
