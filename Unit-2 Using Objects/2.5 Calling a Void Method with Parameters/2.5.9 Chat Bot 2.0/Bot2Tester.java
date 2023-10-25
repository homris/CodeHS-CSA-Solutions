import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
       System.out.println("Hello! What is your name?");
       String username = input.nextLine();
       Bot2 object = new Bot2(username);
       object.greeting();
       System.out.println();
       
       System.out.println("What is your favorite animal?");
       String favAnimal = input.nextLine();
       object.favoriteAnimal(favAnimal);
       System.out.println();
       
       System.out.println("If you could visit any place, where would you go? ");
       String mostVisit = input.nextLine();
       object.destination(mostVisit);
       System.out.println();
       
       System.out.println("What is your favorite number? ");
       int favNum = input.nextInt();
       object.favoriteNumber(favNum);
       System.out.println();
       
       object.goodbye();
       
    }
}