import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner input = new Scanner(System.in);
        Calculator object = new Calculator();
        
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + (object.sum(num1, num2)));
        System.out.println(num1 + " - " + num2 + " = " + (object.subtract(num1, num2)));
        System.out.println(num1 + " * " + num2 + " = " + (object.multiply(num1, num2)));
        System.out.println(num1 + " / " + num2 + " = " + (object.divide(num1, num2)));
    }
}