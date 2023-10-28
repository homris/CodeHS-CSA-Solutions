import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for goal amount
        System.out.println("Enter your goal: ");
        int goal = input.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount: ");
        int actual = input.nextInt();
        // Compare numbers by creating three booleans
        boolean compare1 = actual > goal;
        boolean compare2 = actual == goal;
        boolean compare3 = actual < goal;
        // Display results as instructed
        System.out.println("Went over goal? " + compare1);
        System.out.println("Did not meet goal? " + compare3);
        System.out.println("Met goal exactly? " + compare2);
    }
}