import java.util.ArrayList;

public class ArrayListMethods
{
    
    public static void print(ArrayList<Double> array) {
        
        for(double num : array) {
            System.out.println(num);
        }
        
    }
    
    public static void condense(ArrayList<Double> array) {
        
        for(int i = 0; i < array.size() - 1; i++)
        {
            array.set(i, array.get(i) * array.get(i + 1));
            array.remove(i + 1);
        }
        
    }
    
    public static void duplicate(ArrayList<Double> array) {
        
        int size = array.size();
        
        for(int i = 0; i < size; i++) {
            array.add(array.get(i));
        }
        
    }
    
}