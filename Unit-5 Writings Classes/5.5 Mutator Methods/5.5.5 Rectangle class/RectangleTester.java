public class RectangleTester
{
    public static void main(String[] args)
    {
        // Make some objects and print out their
        // areas and perimeters
        Rectangle object1 = new Rectangle(5, 6);
        Rectangle object2 = new Rectangle(9, 22);
        
        System.out.println(object1.getArea());
        System.out.println(object1.getPerimeter());
    }
}