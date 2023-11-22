import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
       Scanner input = new Scanner(System.in);
       
       System.out.println("Do you know how tall Mt. Everest is?");
       System.out.println("See if you can guess the height in meters.");
       
       System.out.print("Guess the height: ");
       int height = input.nextInt();
       
       while(height != 8848) {
           System.out.println("That's not it!");
           System.out.print("Guess the height: ");
           height = input.nextInt();
       }
       System.out.println("Right! Mt. Everest is 8848 meters tall!");
        
          
    }
}