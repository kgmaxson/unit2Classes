import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Kevin Maxson
 * @version 6 October 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Creates and draws objects in the world
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // Creates instances of classes and invoke the draw method on each
        
        // Draws Background
        
        Background background1 = new Background();
        background1.draw(g2);
        
        //Draws House base
        House base1 = new House(150,200);
        base1.draw(g2);
        
        //Draws two windows
        Window window1 = new Window(225,250);
        window1.draw(g2);
        
        Window window2 = new Window(325,250);
        window2.draw(g2);
        
        //Draws a door
        Door door1 = new Door(280,370);
        door1.draw(g2);
        
        //Draws a sun
        Sun sun1 = new Sun(20,20);
        sun1.draw(g2);
        
        //Draws three trees
        Tree tree1 = new Tree(500,300);
        tree1.draw(g2);
        
        Tree tree2 = new Tree(600,300);
        tree2.draw(g2);
        
        Tree tree3 = new Tree(700,300);
        tree3.draw(g2);
        
        //Draws five squirrels in random places on the grass
        
        for(int i=0;i<5;i++){
            double randNum = Math.random()*600.0;
            double randNum2 = Math.random()*120.0;
            Squirrel squirrel1 = new Squirrel((int)randNum,(int)randNum2+440);
            squirrel1.draw(g2);
        }

        
    }

}
