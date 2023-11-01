import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        
        System.out.println("Enter the company's secret code: ");
        String secretCode = input.nextLine();
        
        String combine1 = password + companyCode;
        String combine2 = password + secretCode;
        
        if (combine1.equals(combine2)) {
            System.out.println("Access granted");
        }
        else {
            System.out.println(combine2 + " is denied");
        }
    }
}