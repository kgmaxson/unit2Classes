import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class TargetComponent here.
 * 
 * @author Kevin Maxson
 * @version (a version number or a date)
 */
public class TargetComponent extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */

    public TargetComponent()
    {
        // initialise instance variables
    }


    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target(0,0);

        Target target2 = new Target(0,0);
        
        target1.draw(g2);
        target2.draw(g2);
    }

}
