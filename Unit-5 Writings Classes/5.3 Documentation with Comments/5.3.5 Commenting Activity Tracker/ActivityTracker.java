public class ActivityTracker
{
    public static void main(String[] args)
    {
        //Initialize mylog object.
        ActivityLog mylog = new ActivityLog();
        
        //Add miles and hours to mylog object.
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //Print total miles of mylog object.
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        //Store hours of mylog object in a hoursToday variable.
        double hoursToday = mylog.getHours();
        
        //Add hours to mylog object.
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        //Store increase in hours of mylog object in an increase variable.
        double increase = mylog.getHours() - hoursToday;
        
        //Print the increase in hours of the mylog object.
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}