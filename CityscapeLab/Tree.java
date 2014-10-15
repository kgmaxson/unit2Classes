import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.Color;
import java.util.Random;

/**
 * Write a description of class Tree here.
 * 
 * @author Kevin Maxson
 * @version 10/6/14
 */
public class Tree
{
    /** x coordinate and y coordinate of the start of the object*/
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Tree
     */
    public Tree(int x,int y)
    {
        // initialise instance variables
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws a tree object into the world
     *
     * @pre        xLeft and yTop will be within the window
     * @post    draws a tree object
     * @param    xLeft is the distance from the left of the window
     *          yTop is the distance from the top of the window
     * @return    none
     */
    public void draw(Graphics2D g2)
    {
        //Creates a gray rectangle for the trunk
        Rectangle trunk = new Rectangle(xLeft,yTop,20,100);
        
        g2.setColor(Color.DARK_GRAY);
        g2.draw(trunk);
        g2.fill(trunk);
        
        //Creates the green leaves of the tree by using random circles to compromise the leaves
        for(int i=0;i<10;i++){
            double randNum = Math.random()*40.0;
            double randNum2 = Math.random()*40.0;
            double randNum3 = Math.random()*-40.0;
            Ellipse2D.Double circle1 = new Ellipse2D.Double(xLeft+(int)randNum+(int)randNum3,yTop-(int)randNum2,40,40);
            g2.setColor(Color.GREEN);
            g2.draw(circle1);
            g2.fill(circle1);
        }
        
    }

}
