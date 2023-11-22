import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here
       Scanner input = new Scanner(System.in);
       
       System.out.println("Starting Taffy Timer...");
       System.out.print("Enter the temperature: ");
       int temp = input.nextInt();
       
       while(temp < 270) {
           System.out.println("The mixture isn't ready yet.");
           System.out.print("Enter the temperature: ");
           temp = input.nextInt();
       }
       System.out.println("Your taffy is ready for the next step!");
    }
}