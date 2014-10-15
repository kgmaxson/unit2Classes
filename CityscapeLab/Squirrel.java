import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;
import java.util.Random;

/**
 * Write a description of class Squirrel here.
 * 
 * @author Kevin Maxson
 * @version 10/6/14
 */
public class Squirrel
{
    /** x coordinate and y coordinate of the start of the object*/
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Squirrel
     */
    public Squirrel(int x,int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a squirrel object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a squirrel object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a rectangle for the body
        Rectangle body = new Rectangle(xLeft,yTop,10,20);
        
        g2.setColor(Color.DARK_GRAY);
        g2.draw(body);
        g2.fill(body);
        
        //Creates a rectangle for the tail
        Rectangle tail = new Rectangle(xLeft+10,yTop+16,10,4);
        
        g2.setColor(Color.DARK_GRAY);
        g2.draw(tail);
        g2.fill(tail);
    }

}
