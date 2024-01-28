import java.awt.*;
/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;

    /**
     * Constructor for objects of class Pacman
     */
    public Pacman(int x, int y, int size, Color c)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c;
    }
    
    
    public void draw(Graphics g) {
        g.setColor(c);
        g.fillArc(x,y,size,size, 210,270);
    }
    
}
