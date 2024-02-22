public class LastMultipleOfThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The last multiple of 3 is " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        // your code goes here!
        int multiple = 0;
        
        for(int num : arr) {
            if(num % 3 == 0) {
                multiple = num;
            }
        }
        
        if(multiple != 0) {
            return multiple;
        }
        
        return -1;
    }
}