import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        //Intro
        
        //Dubai or Abu Dhabi
        System.out.print("Do you want to travel to [D]ubai or [A]bu Dhabi?");
        
        String choice = input.nextLine();
        
            //Dubai
            if (firstChoice.toUpperCase().substring(0,1).equals("D")) {
                //Go to Dubai Mall
                //Visit the future museum
                System.out.print("Do you want to go to [D]ubai Mall or [F]uture Museum?");
        
                String dubaiActivity = input.nextLine();
                
                if ((dubaiActivity.toUpperCase().substring(0,1).equals("D"))) {
                    System.out.print("Have fun in Dubai Mall!");
                }
                else if ((dubaiActivity.toUpperCase().substring(0,1).equals("F"))) {
                    System.out.print("Have fun in the Future Museum!");
                }
            }
                    
                
            
            //Abu Dhabi
            else if (firstChoice.toUpperCase().substring(0,1).equals("D")) {
                //Visit the Sheikh Zayed Grand Mosque
                //Ride the world's fastest roller coaster in Ferrari World
                System.out.print("Do you want to go to [G]rand Mosque or [F]errari World?");
        
                String abuActivity = input.nextLine();
                
                if ((abuActivity.toUpperCase().substring(0,1).equals("G"))) {
                    System.out.print("Have fun in the Sheikh Zayed Grand Mosque!");
                }
                else if ((abuActivity.toUpperCase().substring(0,1).equals("F"))) {
                    System.out.print("Have fun in Ferrari World!");
                }
            }
            
    }
}