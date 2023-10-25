import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate:");
        double taxRate = input.nextDouble();
        
        System.out.println("How many boards do you need? ");
        int boardNum = input.nextInt();
        
        System.out.println("How many windows do you need? ");
        int windowNum = input.nextInt();
        
        Construction object = new Construction(8, 11, taxRate);
        
        double total = object.lumberCost(boardNum) + object.windowCost(windowNum);
        System.out.println("Total: " + total);
        
        double grandTotal = object.grandTotal(total);
        System.out.println("Grand Total: " + grandTotal);
        
    }
}