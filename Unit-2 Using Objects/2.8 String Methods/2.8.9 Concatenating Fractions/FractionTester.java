import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        Fraction object1 = new Fraction(1, 2);
        int a = object1.getNumerator();
        int b = object1.getDenominator();
        // Ask for input
        int c = input.nextInt();
        int d = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction object2 = new Fraction(c, d);
        // Add the fractions
        int top = (a*d + b*c);
        int bottom = (b*d);
        Fraction object3 = new Fraction(top, bottom);
        // Make use of the getDenominator and getNumerator methods
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        System.out.println(a + "/" + b + " + " + c + "/" + d + " = " + object3.toString());
    }
}