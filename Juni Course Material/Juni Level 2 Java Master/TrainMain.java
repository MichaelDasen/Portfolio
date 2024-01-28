
import java.awt.*;
import javax.swing.*;

/**
 * Class TrainMain - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class TrainMain extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;
    
    public void paint(Graphics g) 
    {
        Train t = new Train(100,100,Color.green,10);
        //t.draw(g);
        FirstTrain ft = new FirstTrain(true,true,100,100,Color.green);
        ft.draw(g);
    
    
    
    }

}
