public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website first = new Website();
        Website second = new Website("goodSchool", "edu");
        Website third = new Website("goodSchool", "edu", 100000);
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}