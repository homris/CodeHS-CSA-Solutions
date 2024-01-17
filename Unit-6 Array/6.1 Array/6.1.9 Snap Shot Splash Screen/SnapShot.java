public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] splash = {"Welcome", "to", "the snap shot", "app!"};
        
        for(int i = 0; i < splash.length; i++) {
            System.out.println(splash[i]);
        }
        
        System.out.println();
        
        splash[0] = "Upgrade";
        splash[3] = "premium app!";
        
        for(int i = 0; i < splash.length; i++) {
            System.out.println(splash[i]);
        }
    }
}