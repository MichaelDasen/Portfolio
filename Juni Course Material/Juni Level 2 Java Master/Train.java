import java.awt.*;
/**
 * Write a description of class Train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Color c;
    private int cars;

    /**
     * Constructor for objects of class Train
     */
    public Train(int x, int y, Color c, int cars)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.c = c;
        this.cars = cars;
        
    }
    
    public void draw(Graphics g) 
    {   
        
        for (int i = 0; i < cars; i++) {
            g.setColor(c);
            g.fillRect(x,y,50,50);
            g.setColor(Color.black);
            g.fillOval(x,y+50,20,20);
            g.fillOval(x+30,y+50,20,20);
            x += 70;
            
        }
    }
    
    public int getX() {
        return x;
    }   
    public int getY() {
        return y;
    }   
    
    
    
    
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
