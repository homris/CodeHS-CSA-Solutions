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
    
    public static void addStudent(int index, String name, int grade)
    {
        // Create Student
        Student student = new Student(name, grade);
        
        // Add to classList
        classList.add(index, student);
    }
    
    
    //Add the static methods here:
    public static String getLastStudent() {
        
        return classList.get(classList.size() - 1).getName();
    }
    
    public static int getClassSize() {
        
        return classList.size();
    }
    
    public static String getStudent(int index) {
        
        return classList.get(index).getName();
    }


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