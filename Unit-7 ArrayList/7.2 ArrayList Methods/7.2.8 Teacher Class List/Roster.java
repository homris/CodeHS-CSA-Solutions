import java.util.ArrayList;

public class Roster {
    
    // Implement the student ArrayList
    private static ArrayList<Student> classList = new ArrayList<Student>();
    
    
    public static void addStudent(String name, int grade)
    {
        // Create Student
        Student student = new Student(name, grade);
        
        // Add to classList
        classList.add(student);
    }
    
    /*Don't change the code in this method!
    This method will print out all the Student names in the classList Array
    */
    public static String printClassList()
    {
        String names = "";
        for(Student name: classList)
        {
            names+= name.getName() + "\n";
        }
        return "Student Class List:\n" + names;
    }
    
}