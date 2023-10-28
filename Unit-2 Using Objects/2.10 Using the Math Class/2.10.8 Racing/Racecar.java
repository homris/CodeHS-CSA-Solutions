public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track rounded to 2 decimals
    public double computeTime(double distance)
    {
        double time = Math.sqrt(2 * distance / accel);
        double roundOff = Math.round(time * 100) / 100.0;
        return roundOff;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}