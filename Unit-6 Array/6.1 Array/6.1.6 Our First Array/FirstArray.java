public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
      String[] city = {"Las Vegas", "Minsk", "Sao Paulo"};
      int[] population = {667501, 2038822, 12330000};
      double[] minSun = {8.11, 1.36, 6.05};
      
      // Print all 3 arrays according to the output in the description
      System.out.println(city[0] + "'s population is " + population[0] + ".");
      System.out.println(city[1] + "'s population is " + population[1] + ".");
      System.out.println(city[2] + "'s population is " + population[2] + ".");
      System.out.println();
      System.out.println("The least amount of sunshine " + city[0] + " gets is " + minSun[0] + " hours a day.");
      System.out.println("The least amount of sunshine " + city[1] + " gets is " + minSun[1] + " hours a day.");
      System.out.println("The least amount of sunshine " + city[2] + " gets is " + minSun[2] + " hours a day.");
    }
}