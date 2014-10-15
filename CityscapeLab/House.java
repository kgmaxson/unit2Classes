import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;

/**
 * Write a description of class House here.
 * 
 * @author Kevin Maxson
 * @version 10/6/14
 */
public class House
{
    /** x coordinate and y coordinate of the start of the object*/
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class House
     */
    public House(int x,int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a house object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a house object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a rectangle for the house base and draws it
        Rectangle base = new Rectangle(xLeft,yTop,300,250);
        
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(base);
        g2.fill(base);
        
        //Creates a triangle for the roof and draws it
        Polygon roof = new Polygon(new int[]{xLeft,xLeft+300,xLeft+150},new int[]{yTop,yTop,yTop-100},3);
        g2.setColor(Color.RED);
        g2.draw(roof);
        g2.fill(roof);
    }

}
