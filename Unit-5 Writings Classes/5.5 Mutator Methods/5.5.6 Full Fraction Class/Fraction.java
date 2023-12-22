public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);        denominator *= other.getDenominator();
        //denominator *= other.getDenominator();

    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator = (numerator * other.getDenominator()) - (other.getNumerator() * denominator);
        denominator *= other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        numerator *= other.getNumerator();
        denominator *= other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        String fraction = (numerator + "/" + denominator);
        return fraction;
    }
}