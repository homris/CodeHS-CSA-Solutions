public class WorkShift
{
    public static void main(String[] args)
    {
        int hours = 20;
        hours *= 60;
        int mins = 42;
        int seconds = 16;
        int totalSeconds = ((hours * 60) + (mins * 60) + seconds);
        
        System.out.println(totalSeconds);
    }
}