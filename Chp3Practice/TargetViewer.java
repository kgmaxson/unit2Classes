import javax.swing.JFrame;

/**
 * Write a description of class TargetViewer here.
 * 
 * @author Kevin Maxson
 * @version (a version number or a date)
 */
public class TargetViewer
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class TargetViewer
     */
    public TargetViewer()
    {
        // initialise instance variables
    }


    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        
        frame.setSize(400,500);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }

}
