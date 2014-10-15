import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Background here.
 * 
 * @author Kevin Maxson
 * @version 10/6/14
 */
public class Background
{
    

    /**
     * Default constructor for objects of class Background
     */
    public Background()
    {
        // initialise instance variables
    }


    
    /**
     * Draws a background into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a background object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a green rectangle for the grass
        Rectangle grass = new Rectangle(0,400,800,200);
        
        g2.setColor(Color.GREEN);
        g2.draw(grass);
        g2.fill(grass);
        
        //Creates a blue rectangle for the sky
        Rectangle sky = new Rectangle(0,0,800,400);
        
        g2.setColor(Color.BLUE);
        g2.draw(sky);
        g2.fill(sky);
    }

}
