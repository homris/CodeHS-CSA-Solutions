import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        System.out.println("Enter a number or 0 to quit:");
        int num = input.nextInt();
        
        int large = num;
        int small = num;
        
        while (true){
            if (num > large){
                large = num;
                } else if(num < small){
                    small = num;
                    }
            if (num == 0){
                break;
                }
            System.out.println("Results so far:");
            System.out.println("Largest number: " + large);
            System.out.println("Smallest number: " + small);
            System.out.println("Enter a number or 0 to quit:");
            num = input.nextInt();
        }
    }
}