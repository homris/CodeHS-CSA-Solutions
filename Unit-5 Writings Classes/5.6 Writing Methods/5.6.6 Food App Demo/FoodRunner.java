import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        
        Food obj1 = new Food("Cheeseburger", 800);
        Food obj2 = new Food("Pizza", 900);
        Food obj3 = new Food("Strawberry Milkshake", 350);
        
        int totalCal = 0;
        
        System.out.println(obj1);
        System.out.println("How many would you like?");
        int num1 = input.nextInt();
        
        totalCal += obj1.getCalories() * num1;
        
        
        System.out.println(obj2);
        System.out.println("How many would you like?");
        int num2 = input.nextInt();
        
        totalCal += obj2.getCalories() * num2;
        
        
        System.out.println(obj3);
        System.out.println("How many would you like?");
        int num3 = input.nextInt();
        
        totalCal += obj3.getCalories() * num3;
        
        System.out.println("Your meal will have a total of " + totalCal + " calories");
        
    }
}