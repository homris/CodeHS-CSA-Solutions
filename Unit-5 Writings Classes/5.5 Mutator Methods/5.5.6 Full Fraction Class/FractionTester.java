public class FractionTester
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        Fraction frac1 = new Fraction(4, 6);
        Fraction frac2 = new Fraction(1, 9);
        
        // Then add code here to test out your Fraction class!
        System.out.println("BEFORE:");
        System.out.println("first: " + frac1);
        System.out.println("second: " + frac2);

        frac1.multiply(frac2);

        System.out.println("AFTER:");

        System.out.println("first: " + frac1);
        System.out.println("second: " + frac2);
    }
}