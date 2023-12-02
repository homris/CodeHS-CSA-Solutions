public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        for(int i = 0; i < 9; i++) {
            
            for(int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            
            for(int j = 0; j < 9 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}