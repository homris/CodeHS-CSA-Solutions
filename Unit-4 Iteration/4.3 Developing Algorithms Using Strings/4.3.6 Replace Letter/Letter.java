import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        System.out.println("Enter a word:");
        String inputWord = input.nextLine();
        
        System.out.println("Enter the letter to be replaced:");
        String letter1 = input.nextLine();
        
        System.out.println("Enter the new letter:");
        String letter2 = input.nextLine();
        
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println(replaceLetter(inputWord, letter1, letter2));
    }
    
    // Modify this method so that it will take a third parameter from a user --
    // the String with which they want to replace letterToReplace 
    // 
    // This method should replace all BUT the first occurence of letterToReplace
    // You may find .indexOf to be useful, though there are several ways to solve this problem.
    // This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String letterToAdd)
    {
        
        String newWord = word;
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                count++;
                if(count > 1) {
                    String first = newWord.substring(0,i);
                    String last = newWord.substring(i+1);
                    newWord = first + letterToAdd + last;
                }
            }
        }
        return newWord;
    }
}