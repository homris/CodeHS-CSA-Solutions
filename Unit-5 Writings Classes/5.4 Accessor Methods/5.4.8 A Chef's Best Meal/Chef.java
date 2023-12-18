public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;
    
    public Chef(String theName, String theRestaurant, Meal theBestMeal) {
        name = theName;
        restaurant = theRestaurant;
        bestMeal = theBestMeal;
    }
    
    // Put getters here
    public String getName() {
        return name;
    }
    
    public String getRestaurant() {
        return restaurant;
    }
    
    public String getMealName() {
        return bestMeal.getName();
    }
    
    public int getMealServings() {
        return bestMeal.getNumberOfServings();
    }
    
    public String getMealCourse() {
        return bestMeal.getCourse();
    }
    

    // String representation of the object
    public String toString()
    {
        return "Chef " + name + " works at " + restaurant + " and is best known for " + bestMeal;
    }
}