public class ClassListTester
{
    public static void main(String[] args)
    {
        //You don't need to change anything here, but feel free to add more Students!
        Roster.addStudent("Alan", 11);
        Roster.addStudent("Alex", 10);
        Roster.addStudent("Anita", 12);
        System.out.println(Roster.printClassList());
        
        System.out.println("Last Student: " + Roster.getLastStudent());
        System.out.println("First Student: " + Roster.getStudent(0));
    
        System.out.println();
        Roster.addStudent(2, "Trevor", 12);
        System.out.println(Roster.printClassList());
        System.out.println("Class Size: " + Roster.getClassSize());
    }
}