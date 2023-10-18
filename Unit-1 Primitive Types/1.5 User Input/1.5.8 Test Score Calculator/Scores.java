import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the first test name: ");
        String name1 = input.nextLine();
        
        System.out.print("Please enter the first test score: ");
        double score1 = input.nextDouble();
        
        input.nextLine();
        
        System.out.print("Please enter the second test name: ");
        String name2 = input.nextLine();
        
        System.out.print("Please enter the second test score: ");
        double score2 = input.nextDouble();
        
        input.nextLine();
        
        System.out.print("Please enter the third test name: ");
        String name3 = input.nextLine();
        
        System.out.print("Please enter the third test score: ");
        double score3 = input.nextDouble();
        
        System.out.println("Your average score is: " + ((score1 + score2 + score3) / 3));
    }
}