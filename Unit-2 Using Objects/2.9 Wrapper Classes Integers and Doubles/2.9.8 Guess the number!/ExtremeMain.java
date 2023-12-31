import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes object = new Extremes();

        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum integer value is?");
        int guessMax = input.nextInt();

        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int multiMax = object.maxQuotient(guessMax);
        System.out.println("You'd need to multiply your number by " + multiMax + " to reach the max value!");

        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum integer value is?");
        int guessMin = input.nextInt();

        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        int multiMin = object.minQuotient(guessMin);
        System.out.println("You'd need to multiply your number by " + multiMin + " to reach the max value!");
    }
}