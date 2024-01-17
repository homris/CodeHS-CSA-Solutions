public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr1 = new String[]{"w", "x", "y", "z"};
        printArr(arr1);
        
        String[] arr2 = new String[]{"a", "b", "c"};
        printArr(arr2);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + ". " + arr[i]);
        }
        
    }
}