public class Routine
{
    private double school;
    private double sleep; 
    private double friends;
    private double hobbies;
    
    public Routine() {
        school = 0;
        sleep = 0;
        friends = 0;
        hobbies = 0;
    }
    
    public double getSchool() {
        return school;
    }
    
    public double getSleep() {
        return sleep;
    }
    
    public double getFriends() {
        return friends;
    }
    
    public double getHobbies() {
        return hobbies;
    }
    
    public void setSchool(double x) {
        school = x;
    }
    
    public void setSleep(double x) {
        sleep = x;
    }
    
    public void setFriends(double x) {
        friends = x;
    }
    
    public void setHobbies(double x) {
        hobbies = x;
    }
    
    public void printTotal() {
        double total = 7 * (school + sleep + friends + hobbies);
        
        System.out.println("How You Spend Your Week");
        System.out.println("At School: " + 7 * school);
        System.out.println("Sleeping: " + 7 * sleep);
        System.out.println("With Friends: " + 7 * friends);
        System.out.println("Doing fun stuff: " + 7 * hobbies);
        System.out.println("You're busy " + total + " hours a week!");
    }
}