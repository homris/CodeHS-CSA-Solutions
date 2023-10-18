import java.util.Scanner;
//Refer to your code from the previous Personalized T-shirts exercise. 
// Modify it using the Scanner class to take user input instead of hard coding 
//       the cost of the shirt. 

public class Tshirt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the cost of the t-shirt: ");
        int cost = input.nextInt();
        
        System.out.println("The t-shirt costs: " + cost);
        cost++;
        
        System.out.println("The personalized t-shirt costs: " + cost);
        cost--;
        
        System.out.println("Without personalization, the t-shirt costs: " + cost);
    }
}