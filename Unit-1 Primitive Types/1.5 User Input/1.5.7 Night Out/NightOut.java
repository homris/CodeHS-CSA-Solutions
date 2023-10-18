import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much does your dinner usually cost?");
        double dinner = input.nextDouble();
        
        System.out.println("How much does laser tag cost per person?");
        double laserTag = input.nextDouble();
        
        System.out.println("How much does three scoops of ice cream cost?");
        double iceCream = input.nextDouble();
        
        System.out.println("Dinner: " + (dinner * 3));
        System.out.println("Laser Tag: " + (laserTag * 2));
        System.out.println("Ice Cream: " + (iceCream * 4 / 3));
        System.out.println("Grand Total: " + ((dinner * 3) + (laserTag * 2) + (iceCream * 4 / 3)));
    }
}