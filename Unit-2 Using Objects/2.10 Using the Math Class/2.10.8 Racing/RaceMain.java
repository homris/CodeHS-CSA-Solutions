public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acceleration1 = Math.random() + 1;
        double acceleration2 = Math.random() + 1;
        
        // Create two Racecar objects
        Racecar object1 = new Racecar(acceleration1, "Metehan");
        Racecar object2 = new Racecar(acceleration2, "Homriş");
        // Compute the finishing times for both cars
        double time1 = object1.computeTime(distance);
        double time2 = object2.computeTime(distance);
        // Print times of each car
        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");
    }
}