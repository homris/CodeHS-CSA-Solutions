import java.util.ArrayList;
public class Billboard {
    private ArrayList<Musician> top10 = new ArrayList<Musician>();

    public void add(Musician singer) {
    
    if(singer.getIsPlatinum() && top10.size() < 10) {
        top10.add(singer);
        
    }
    else if(singer.getIsPlatinum() && top10.size() == 10) {
        replace(singer);
        
    }
    else
    {
    System.out.println("Sorry, "+ singer.getName() + " does not qualify for Top 10");
    }
    }

    public void replace(Musician singer) {
        int min = top10.get(0).getWeeksInTop40();
        int minIndex = 0;
        for(int index = 0; index < top10.size(); index++) {
            int numWeeksTop40 = top10.get(index).getWeeksInTop40();
            if(numWeeksTop40 < min) {
                min = numWeeksTop40;
                minIndex = index;
                
            }
            
        }
        if(min < singer.getWeeksInTop40()) {
            System.out.println("The musician "+ top10.get(minIndex)+ " has been replaced by " + singer.getName() + ".");
            top10.set(minIndex, singer);
            
        }
        else {
            System.out.println("Sorry, " + singer.getName() + " has less weeks in the Top 40 than the other musicians.");
            
        }
        
    }

    public void printTop10() {
        System.out.println(top10);
        
    }
}