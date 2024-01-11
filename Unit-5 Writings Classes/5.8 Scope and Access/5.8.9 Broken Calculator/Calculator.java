public class Calculator {

    private int total;
    private int value; // Value is the number stored in memory

    public Calculator(int startingValue){
        total = startingValue;
        value = 0;
    }

    public int add(int value){
        total += value;
        return total;
    }

    /**
    * Adds the instance variable value to the total
    */
    public int add(){
        total += value;
        return total;
    }

    public int multiple(int value){
        total *= value;
        return total;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}