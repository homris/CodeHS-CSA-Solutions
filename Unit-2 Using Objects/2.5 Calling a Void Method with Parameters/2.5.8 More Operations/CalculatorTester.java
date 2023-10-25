import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        Calculator object = new Calculator();
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        
        object.add(num1, num2);
        object.subtract(num1, num2);
        object.multiply(num1, num2);
        object.divide(num1, num2);
    }
}