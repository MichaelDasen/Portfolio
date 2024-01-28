import java.awt.*;
/**
 * Write a description of class MsPacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MsPacman extends Pacman{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class MsPacman
     */
    public MsPacman(int x, int y, int size, Color c)
    {
        // initialise instance variables
        super(x,y,size,c);
        
        
    }
    
    public void draw(Graphics g,int x,int y) {
        super.draw(g);
        g.setColor(Color.pink);
        g.fillPolygon(new int[]{x + 125,x+175,x+225,x+225,x+175,x+125},new int[]{y-50,y,y-50,y+50,y,y+50},6);
    }

    
}