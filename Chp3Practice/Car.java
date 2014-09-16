

/**
 * A car class tracks fuel capacity and consumption based on efficiency
 * 
 * @author kgmaxson
 * @version 9/12/14
 */
public class Car
{
    /** fuel efficiency of the car measured in miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel in gas tank measured in gallons */
    private double fuelInTank;

    /**
     * Constructor that specifies the fuel efficiency of this car
     */
    public Car(int efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * The drive method reduces the fuel in the tank based on the specified miles
     * and the efficiency of this car
     *
     * @pre        this method is never invoked with a value for miles that
     *              consumes more than the available gas in the tank.
     * @param    miles    vumber of miles driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
        
    }



    /**
     * Returns the number of gallons of gas remaining in this car's tank
     *
     * @return  number of gallons of gas remaining in this car's tank
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }

    /**
     * Adds the specified amount of gas in gallons to this car's tank.
     *
     * @pre     the specified amount of gas doesn't exceed the capacity of this car's tank
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   gallons     number of gallons of gas to add to this car's tank
     */
    public void addGas(int gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
        
    }

}
