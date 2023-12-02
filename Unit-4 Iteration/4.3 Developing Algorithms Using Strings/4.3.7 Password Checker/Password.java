import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
        String key = input.nextLine();
        System.out.print(passwordCheck(key));
    }
    
    public static boolean passwordCheck(String password)
    {
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
        for(int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if(password.length() < 8) {
                return false;
            }
            else if((character >= '0' && character <= '9') || (character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}