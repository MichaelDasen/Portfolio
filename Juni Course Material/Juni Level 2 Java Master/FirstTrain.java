
/**
 * Write a description of class FirstTrain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;

public class FirstTrain extends Train 
{
    // instance variables - replace the example below with your own
    private boolean hasChimney;
    private boolean hasWindow;

    /**
     * Constructor for objects of class FirstTrain
     */
    public FirstTrain(boolean hasChimney, boolean hasWindow, int x, int y, Color c)
    {
        // initialise instance variables
        super(x,y,c,1);
        this.hasChimney = hasChimney;
        this.hasWindow = hasWindow;
    }
    
    public void draw(Graphics g) {
        super.draw(g);
        if (hasChimney == true) {
            g.setColor(Color.red);
            g.fillRect(getX()-50,getY()-40,30,40);
        }
        if (hasWindow == true) {
            g.setColor(Color.blue);
            g.fillRect(getX() - 60, getY() + 10, 30,30);
        }
    }

    
}
