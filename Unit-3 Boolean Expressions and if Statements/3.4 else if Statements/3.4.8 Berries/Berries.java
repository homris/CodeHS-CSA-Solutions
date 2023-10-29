import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask for a berry
        String berry = input.nextLine();
        char store = berry.charAt(0);
        
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using ==
        if (store == 'E') {
            System.out.println("You ordered Elderberry");
        }
        else if (store == 'G') {
            System.out.println("You ordered Gooseberry");
        }
        else if (store == 'L') {
            System.out.println("You ordered Lingonberry");
        }
        else {
            System.out.println("Berry not recognized");
        }
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}