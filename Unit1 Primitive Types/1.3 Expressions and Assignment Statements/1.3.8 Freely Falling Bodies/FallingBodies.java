public class FallingBodies
{
    public static void main(String[] args)
    {
        double g = 9.8;
        int t = 23;
        
        double height = (0.5 * g * t * t);
        double velocity = (g * t);
        System.out.println("The height is " + height + " m");
        System.out.println("The velocity is " + velocity + " m/s");
    }
}