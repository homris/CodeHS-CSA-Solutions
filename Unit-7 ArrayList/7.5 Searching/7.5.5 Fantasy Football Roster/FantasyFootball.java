import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        String[] team = new String[5];
        
        for(int i = 0; i < 5; i++) {
            
            System.out.println("Enter name of player to add: ");
            String player = input.nextLine();
            
            if(search(availablePlayers, player) >= 0) {
                
                System.out.println("Successfully added player");
                
                team[i] = player;
                
                availablePlayers.remove(search(availablePlayers, player));
                
            }
            else{
                
                System.out.println(player + " is not an available player.");
                i--;// Very important
                
            }
            System.out.println("");
            
        }
        System.out.println("Final Team Roster:");
        
        for(int i = 0; i < 5; i++) {
            
            System.out.println(team[i]);
            
        }
        
        
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        
        for(int index = 0; index < array.size(); index++) {
            
            if(array.get(index).equals(player)) {
                
                return index;
                
            }
            
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        //Feel free to add names of your favorite players to this list!
        //But make sure you DON'T remove any players from it!
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Metehan Homriş");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}