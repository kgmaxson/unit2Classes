

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String state;
    private String name;

    /**
     * Default constructor for objects of class Door
     */
    public Door(String name, String state)
    {
        // initialise instance variables
        this.name = name;
        this.state = state;
    }
    
    public String getName()
    {
        return name;
    }

     public void setName(String newName)
    {
        name = newName;
    }
    
    public void setState(String newState)
    {
        state = newState;
    }
    
     public String getState()
    {
        return state;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void open()
    {
        // put your code here
        this.state = "open";
    }
    
    
    public void close()
    {
        // put your code here
        this.state = "close";
    }

}
