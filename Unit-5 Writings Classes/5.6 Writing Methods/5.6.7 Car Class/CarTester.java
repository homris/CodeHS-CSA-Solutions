public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car myCar = new Car(20, 15);
        
        //Fill up the gas tank
        myCar.addGas();
        
        //Check the miles available
        System.out.println("Miles available: " + myCar.milesAvailable());

        //Drive 100 miles
        myCar.drive(100);

        //Check the miles available
        System.out.println("Miles available: " + myCar.milesAvailable());

        //Add 2 gallons to the gas tank
        myCar.addGas(2);

        //Check the miles available
        System.out.println("Miles available: " + myCar.milesAvailable());
        
        //Try driving more miles than available by driving 1000 miles
        myCar.drive(1000);

        //Drive 200 miles
        myCar.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + myCar.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + myCar.getTotalMilesDriven());

    }
}