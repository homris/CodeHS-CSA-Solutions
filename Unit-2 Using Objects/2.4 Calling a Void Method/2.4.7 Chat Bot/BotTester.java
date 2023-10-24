import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.nextLine();
        Bot object = new Bot(name);
        
        object.greeting();
        object.help();
        System.out.println();
        System.out.println("Tell me Bot, which countries use the imperial system?");
        object.imperialCountries();
        System.out.println();
        System.out.println("Tell me Bot, what was the first computer bug?");
        object.firstBug();
        System.out.println();
        object.goodbye();
        
    }
}