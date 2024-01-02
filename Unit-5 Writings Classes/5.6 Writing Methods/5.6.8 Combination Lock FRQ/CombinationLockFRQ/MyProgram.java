public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        CombinationLock comboLock = new CombinationLock("frog");

        System.out.println(comboLock.getClue("oooo")); // "++o+"
        System.out.println(comboLock.getClue("flip")); // "f***"
        System.out.println(comboLock.getClue("form")); // "f++*"
        System.out.println(comboLock.getClue("frag")); // "fr*g"
        System.out.println(comboLock.getClue("frog")); // "frog"
    }
}