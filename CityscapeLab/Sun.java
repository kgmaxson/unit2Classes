import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;

/**
 * Write a description of class Sun here.
 * 
 * @author Kevin Maxson
 * @version 10/6/14
 */
public class Sun
{
    /** x coordinate and y coordinate of the start of the object*/
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x,int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a sun object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a sun object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a yellow circle for the sun
        Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft,yTop,70,70);
        
        g2.setColor(Color.YELLOW);
        g2.draw(circle1);
        g2.fill(circle1);
    }

}
