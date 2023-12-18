public class Meal
{
    private String name;
    private String course;
    private int servings;
    
    // Write the constructor here!
    public Meal(String theName, String theCourse, int numServings) {
        name = theName;
        course = theCourse;
        servings = numServings;
    }
    
    // Put getters here
    public String getName() {
        return name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public int getNumberOfServings() {
        return servings;
    }
    
    

    // String representation of the object
    public String toString()
    {
        return name + " (" + course + ")";
    }
}