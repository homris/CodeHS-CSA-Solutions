public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    /**
    Initializes a ActivityLog object. 
    Precondition: ActivityLog object must take a String theName and int theStrength 
    Postcondition: Instance variables double numHours and double numMiles are initialized with 0
    */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
    Adds double hours to double numHours of an ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: Adds double hours to double numHours accessed from the ActivityLog object.
    
    @param hours -double to add hours to instance variable numHours for ActivityLog object
    */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    Adds double miles to double numMiles of an ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: Adds double miles to double numHours accessed from the ActivityLog object.
    
    @param hours -double to add miles to instance variable numMiles for ActivityLog object
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    Returns the double numMiles of a given ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: Returns double numMiles accessed from the ActivityLog object.
    
    @return numMiles -the number of miles of the ActivityLog object
    */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    Returns the double numHours of a given ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: Returns double numHours accessed from the ActivityLog object.
    
    @return numMiles -the number of hours of the ActivityLog object
    */
    public double getHours() 
    {
        return numHours;
    }
    
}