import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
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
        x = xLeft;
        y = yTop;
        
    }


    public void draw(Graphics2D g2)
    {
        int x1=35;
        int y1=70;
        int r1=310;
        
        for(int i = 1; i<9;i++) {
            Ellipse2D.Double circlex = new Ellipse2D.Double(xLeft+x1,yTop+y1,r1,r1);
            
            if (i%2==0)
                {
                g2.setColor(Color.YELLOW);
                
           }else{
                g2.setColor(Color.BLUE);
            }
            g2.draw(circlex);
            g2.fill(circlex);
            x1+=20;
            y1+=20;
            r1-=40;
        }
    }
}