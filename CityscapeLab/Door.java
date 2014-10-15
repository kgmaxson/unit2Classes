import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;


/**
 * Write a description of class Door here.
 * 
 * @author Kevin Maxson 
 * @version 10/6/14
 */
public class Door
{
    /** x coordinate and y coordinate of the start of the object*/
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Door
     */
    public Door(int x,int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a door object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a door object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a rectangle for the door
        Rectangle r1 = new Rectangle(xLeft,yTop,40,80);
        
        g2.setColor(Color.RED);
        g2.draw(r1);
        g2.fill(r1);
        
        //Creates a white circle for the doorknob
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft+30,yTop+40,3,3);
        
        g2.setColor(Color.WHITE);
        g2.draw(circle1);
        g2.fill(circle1);
        
        
    }

}
