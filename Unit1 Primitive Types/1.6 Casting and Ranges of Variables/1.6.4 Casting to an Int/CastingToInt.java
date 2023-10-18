import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a double:");
        double number1 = input.nextDouble();
        System.out.println(number1);
        
        int number2 = (int)number1;
        System.out.println(number2);
        
        double number3 = number1 + 0.5;
        System.out.println(number3);
        
        int number4 = (int)number3;
        System.out.println(number4);
        
        
        
        
    }
}