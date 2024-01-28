
import java.awt.*;
import javax.swing.*;

/**
 * Class PacmanMain - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class PacmanMain extends JApplet
{
    // instance variables - replace the example below with your own
    public void paint(Graphics g) 
    {
        //Pacman p = new Pacman(100,100,500, Color.yellow);
        //p.draw(g);
        
        MsPacman ms = new MsPacman(100,100,300,Color.yellow);
        ms.draw(g,100,100);
    
    
    
    }
    
}
