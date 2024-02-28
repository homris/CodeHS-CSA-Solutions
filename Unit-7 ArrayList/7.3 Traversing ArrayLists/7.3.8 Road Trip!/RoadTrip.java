import java.util.ArrayList;

public class RoadTrip
{
    
    private ArrayList<GeoLocation> locations = new ArrayList<GeoLocation>();
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude) {
        
        GeoLocation location = new GeoLocation(name, latitude, longitude);
        
        locations.add(location);
        
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops() {
        
        return locations.size();
        
    }
    
    // Get the total miles of the trip
    public double getTripLength() {
        
        double total = 0;
        
        for(int i = 1; i < locations.size(); i++)
        {
            total += locations.get(i).distanceFrom(locations.get(i - 1));
        }
        
        return total;
        
    }
    
    // Return a formatted toString of the trip
    public String toString() {
        
        String list = "";
        
        for(int i = 0; i < locations.size(); i++)
        {
            list += i + 1 + ". " + locations.get(i).toString() + "\n";
            
        }
        return list;

        
    }
}