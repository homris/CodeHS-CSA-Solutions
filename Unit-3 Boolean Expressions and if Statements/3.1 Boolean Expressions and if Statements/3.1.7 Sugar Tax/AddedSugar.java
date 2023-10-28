import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for the grams of sugar
        System.out.println("How many grams of sugar have you eaten today?");
        int value = input.nextInt();
        // Use a boolean expression to print if they can eat more sugar
        boolean compare = value < 30;
        System.out.println("You can eat more sugar: " + compare);
    }
}