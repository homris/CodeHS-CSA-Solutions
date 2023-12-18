public class Messages
{
    public static void main(String[] args)
    {
        // Your code here.
        // Create two Comment objects and print them out.
        
        Comment object1 = new Comment("Metehan", "Hello", "2022");
        Comment object2 = new Comment("Osman", "Hi", "2021");
        
        // Then use the accessor methods to print out the instance variables
        System.out.println(object1);
        System.out.println(object1.getPoster());
        
        System.out.println(object2);
        System.out.println(object2.getDate());
        
    }
}