

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author Kevin Maxson 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void fillUp()
    {
        VendingMachine machine1 = new VendingMachine(50);
        machine1.fillUp(20);
        int cansTest = machine1.getCanCount();
        assertEquals(70,cansTest);
    }
    
        @Test
    public void insertToken()
    {
        VendingMachine machine1 = new VendingMachine(50);
        machine1.insertToken();
        int cansTest = machine1.getCanCount();
        assertEquals(49,cansTest);
        int tokensTest = machine1.getTokenCount();
        assertEquals(1,tokensTest);
    }
    
        @Test
    public void getCanCount()
    {
        VendingMachine machine1 = new VendingMachine(50);
        int cansTest = machine1.getCanCount();
        assertEquals(50,cansTest);
    }
    
        @Test
    public void getTokenCount()
    {
        VendingMachine machine1 = new VendingMachine(50);
        int tokensTest = machine1.getTokenCount();
        assertEquals(0,tokensTest);
    }
}
