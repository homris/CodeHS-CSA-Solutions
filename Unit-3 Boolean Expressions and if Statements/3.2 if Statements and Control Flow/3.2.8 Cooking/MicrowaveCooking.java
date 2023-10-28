import java.lang.Math;

public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
        int seconds = (int) (Math.random() * 151 + 90);
        
       // Print the number of seconds
       System.out.println("Microwaving for " + seconds + " seconds");
       
       // Use two if statements to print the temperature
       if (seconds <= 120) {
           System.out.println("Rolls will be the right temperature!");
       }
       if (seconds > 120) {
           System.out.println("Rolls will be boiling hot!");
       }
    }
}