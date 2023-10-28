public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        double angle1 = 0;
        double cosine1 = Math.cos(angle1);
        double sine1 = Math.sin(angle1);
        cosine1 = Math.round(cosine1 * 100) / 100.0;
        sine1 = Math.round(sine1 * 100) / 100.0;
        System.out.println(angle1 + ": " + cosine1 + ", " +sine1);
        
        double angle2 = Math.PI/2;
        double cosine2 = Math.cos(angle2);
        double sine2 = Math.sin(angle2);
        cosine2 = Math.round(cosine2 * 100) / 100.0;
        sine2 = Math.round(sine2 * 100) / 100.0;
        System.out.println(angle2 + ": " + cosine2 + ", " +sine2);
        
        double angle3 = Math.PI;
        double cosine3 = Math.cos(angle3);
        double sine3 = Math.sin(angle3);
        cosine3 = Math.round(cosine3 * 100) / 100.0;
        sine3 = Math.round(sine3 * 100) / 100.0;
        System.out.println(angle3 + ": " + cosine3 + ", " +sine3);
    }
}