import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        String username = input.nextLine();
        Hello object = new Hello(username);
        
        object.english();
        object.spanish();
        object.french();

    }
}