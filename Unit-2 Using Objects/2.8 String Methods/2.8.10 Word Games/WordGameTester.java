import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        String inputWord = input.nextLine();
        
        // Scramble it
        // Print out scrambled word
        WordGames object = new WordGames(inputWord);
        System.out.println(object.scramble());
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(object.bananaSplit(idx, word));
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        System.out.println("Enter a character: ");
        String character = input.nextLine();
        
        System.out.println("Enter another word: ");
        String newWord = input.nextLine();
        
        System.out.println(object.bananaSplit(character, newWord));
        System.out.println(object.toString());
        
        
        
    }
}