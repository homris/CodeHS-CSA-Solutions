public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(5);
        
        // Square the number
        // Print it out
        double numSquare = game.squareNumber();
        System.out.println(numSquare);
        
        // Double the number
        // Print it out
        double doubled = game.doubleNumber();
        System.out.println(doubled);
        
        // Square the number again
        // Print it out
        double squared = game.squareNumber();
        System.out.println(squared);
        
        // Get the number and store the value
        // Print out your stored value 
        double number = game.getNumber();
        System.out.println(number);
        
        // Get the number again then store and print
        // the value
        double number2 = game.getNumber();
        System.out.println(number2);
        
    }
}