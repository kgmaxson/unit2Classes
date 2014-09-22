

/**
 * Write a description of class VendingMachine here.
 * 
 * @author Kevin Maxson 
 * @version (a version number or a date)
 */
public class VendingMachine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cans;
    private int tokens;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cans)
    {
        // initialise instance variables
        this.tokens = 0;
        this.cans = cans;
    }

    
    public void fillUp(int cans)
    {
        // put your code here
        this.cans = this.cans+cans;
    }

    public void insertToken()
    {
        this.tokens += 1;
        this.cans -= 1;
        
        
    }
    
    public int getCanCount()
    {
        return this.cans;
    }
    
    public int getTokenCount()
    {
        return this.tokens;
    }
}
