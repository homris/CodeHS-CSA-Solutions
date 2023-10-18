import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int int1 = input.nextInt();
        System.out.println("Enter the second integer: ");
        int int2 = input.nextInt();
        
        System.out.println(((double)int1) / ((double)int2));

    }
}