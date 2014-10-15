import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;


/**
 * Write a description of class Window here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Window
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Window
     */
    public Window(int x,int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a window object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a window object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Draws the glass for the windows
        Rectangle r1 = new Rectangle(xLeft,yTop,50,50);
        
        g2.setColor(Color.WHITE);
        g2.draw(r1);
        g2.fill(r1);
        
        //Draws the vertical divider in the window
        Rectangle r2 = new Rectangle(xLeft+24,yTop,2,50);
        
        g2.setColor(Color.BLACK);
        g2.draw(r2);
        g2.fill(r2);
        
        //Draws the horizontal divider in the window
        Rectangle r3 = new Rectangle(xLeft,yTop+24,50,2);
        
        g2.setColor(Color.BLACK);
        g2.draw(r3);
        g2.fill(r3);
    }

}
