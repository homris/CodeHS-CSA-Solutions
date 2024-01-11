public class Randomizer
{
    public static int nextInt()
    {
        //Implement this method to return a random number from 1-10
        int randInteger = (int)(Math.random() * (10) + 1);
        return randInteger;
    }
    
    public static int nextInt(int min, int max)
    {
        //Implement this method to return a random integer between min and max
        int randInteger = (int)(Math.random() * (max - min + 1) + min);
        return randInteger;
    }
}