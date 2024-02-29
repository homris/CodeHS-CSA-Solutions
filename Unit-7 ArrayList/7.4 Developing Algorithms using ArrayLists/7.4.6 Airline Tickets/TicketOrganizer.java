import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> arr) {
        
        tickets = arr;
        
    }
    
    public ArrayList getTickets() {
        
        return tickets;
        
    }
    
    public void printPassengersByBoardingGroup()
    {
        for(int a = 1; a < 6; a++)
        {
            System.out.println("Boarding Group " + a + ":");
            
            for(int b = 0; b < tickets.size(); b++)
            {
                if(tickets.get(b).getBoardingGroup() == a) {
                    
                    System.out.println("Passenger " + (b + 1));
                    
                }
            }
        }
    }
    
    
    public void canBoardTogether() {
        
        boolean checker = false;
        
        for(int i = 1; i < tickets.size(); i++) {
            
            if(tickets.get(i - 1).getBoardingGroup() == tickets.get(i).getBoardingGroup() && tickets.get(i - 1).getRow() == tickets.get(i).getRow()) {
                
                System.out.println("Passenger " + i + " can board with Passenger " + (i + 1) + ".");
                checker = true;
                
            }
            
        }
        
        if(!checker) {
            
            System.out.println("There are no passengers with the same row and boarding group.");
            
        }
        
    }
    
    
    
}