import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;



/**
 * Write a description of class Target here.
 * 
 * @author Kevin Maxson
 * @version 9/19/14
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x,int y)
    {
        // initialise instance variables
        x = xLeft;
        y = yTop;
        
    }


    public void draw(Graphics2D g2)
    {
        int x1=75;
        int y1=100;
        int r1=250;
        int count=1;
        
        
        for(int i = 1; i<7;i++) {
            Ellipse2D.Double circlex = new Ellipse2D.Double(xLeft+x1,yTop+y1,r1,r1);
            g2.draw(circlex);
            if (count == 1 || count == 3 || count == 5)
                {
                g2.fill(circlex);
                g2.setColor(Color.ORANGE);
                
           }else{
                g2.fill(circlex);
                g2.setColor(Color.CYAN);
            }
            count+=1;
            x1+=25;
            y1+=25;
            r1-=50;
        }


    }
}