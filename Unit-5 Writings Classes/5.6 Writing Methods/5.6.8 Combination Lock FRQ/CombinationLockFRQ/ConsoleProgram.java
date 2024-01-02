import java.util.*;

public class ConsoleProgram{

    private Scanner scanner;

    public static void main(String[] args){
        // Assume the class name is passed in as the first argument.

        if(args.length == 0){
            System.out.println("Please provide the name of the main class as an argument.");
            return;
        }

        String mainClassName = args[0];

        try{
            Class mainClass = Class.forName(mainClassName);
            Object obj = mainClass.newInstance();
            ConsoleProgram program = (ConsoleProgram)obj;
            program.run();
        } catch (IllegalAccessException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        } catch (InstantiationException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in program. Make sure you extend ConsoleProgram");
        }
    }

    public void run(){
        /* Overridden by subclass */
    }

    public ConsoleProgram(){
        scanner = new Scanner(System.in);

    }

    public String readLine(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean readBoolean(String prompt){

        while(true){
            String input = readLine(prompt);

            if(input.equalsIgnoreCase("true")){
                return true;
            }

            if(input.equalsIgnoreCase("false")){
                return false;
            }
        }
    }

    public double readDouble(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                double n = Double.valueOf(input).doubleValue();
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    // Allow the user to get an integer.
    public int readInt(String prompt){

        while(true){
            String input = readLine(prompt);
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch (NumberFormatException e){

            }
        }
    }

    /**
     * Allows us to use a shorthand version for System.out.println()
     */
    public void println() {
        System.out.println();
    }

    /**
     * Allows us to use a shorthand version for System.out.println(String s)
     */
    public void println(String s) {
        System.out.println(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(boolean x)
     */
    public void println(boolean x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char x)
     */
    public void println(char x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(char[] x)
     */
    public void println(char[] x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(int x)
     */
    public void println(int x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(long x)
     */
    public void println(long x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(float x)
     */
    public void println(float x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(double x)
     */
    public void println(double x) {
        System.out.println(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.println(Object o)
     */
    public void println(Object o) {
        System.out.println(o);
    }

    /**
     * Allows us to use a shorthand version for System.out.print()
     */
    public void print() {
        System.out.print("");
    }

    /**
     * Allows us to use a shorthand version for System.out.print(String s)
     */
    public void print(String s) {
        System.out.print(s);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(boolean x)
     */
    public void print(boolean x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char x)
     */
    public void print(char x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(char[] x)
     */
    public void print(char[] x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(int x)
     */
    public void print(int x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(long x)
     */
    public void print(long x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(float x)
     */
    public void print(float x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(double x)
     */
    public void print(double x) {
        System.out.print(x);
    }

    /**
     * Allows us to use a shorthand version for System.out.print(Object o)
     */
    public void print(Object o) {
        System.out.print(o);
    }
}
