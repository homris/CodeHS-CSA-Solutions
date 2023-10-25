import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: ");
        double startLatitude = input.nextDouble();
        
        System.out.print("Enter the longitude of the starting location: ");
        double startLongitude = input.nextDouble();
        
        GeoLocation location1 = new GeoLocation(startLatitude, startLongitude);
        
        System.out.print("Enter the latitude of the ending location: ");
        double endLatitude = input.nextDouble();
        
        System.out.print("Enter the longitude of the ending location: ");
        double endLongitude = input.nextDouble();
        
        GeoLocation location2 = new GeoLocation(endLatitude, endLongitude);

        double distance = location1.distanceFrom(location2);
        System.out.print("The distance is " + distance + " miles.");
        
    }
}