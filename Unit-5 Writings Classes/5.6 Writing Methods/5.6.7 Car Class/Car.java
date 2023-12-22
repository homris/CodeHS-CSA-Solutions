public class Car {

    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity) {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
        totalMilesDriven = 0;
    }
    
    public void addGas() {
        gas = tankCapacity;
        System.out.println("Filling up ...");
    }
    
    public void addGas(double amount) {
        if(gas + amount > tankCapacity) {
            gas = tankCapacity;
        }
        else {
            gas += amount;
        }
        
        System.out.println("Adding gas ...");
    }
    
    public double getTotalMilesDriven() {
        return totalMilesDriven;
    }
    
    public void drive(double distance) {
        if(canDrive(distance)) {
            totalMilesDriven += distance;
            gas -= distance / efficiency;
            System.out.println("Driving " + distance);
        }
        else {
            System.out.println("Can't drive " + distance + ". That's too far!");
        }
    }
    
    public boolean canDrive (double distance) {
        if(distance > milesAvailable() ) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public double milesAvailable() {
        return gas * efficiency;
    }
    
    public double getGas() {
        return gas;
    }

}