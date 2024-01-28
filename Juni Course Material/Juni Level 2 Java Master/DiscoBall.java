import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DiscoBall extends Applet implements Runnable
{
    Thread t = null;
    Color c = Color.red;
    public void start()
    {
        t = new Thread(this);
        t.start();
    }
    
    public void run()
    {
       // your code goes here
       while (true) {
           c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
           repaint();
           try{Thread.sleep(1000);}
           catch(Exception e)
           {}
    }
    }
    public void paint(Graphics g) {
       // your code goes here
       g.setColor(c);
       g.fillOval(100,100,50,50);
    }
}