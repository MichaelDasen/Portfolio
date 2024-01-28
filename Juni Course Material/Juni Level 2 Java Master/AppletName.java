import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;



public class AppletName extends Applet implements MouseListener
{
    int x;
    int y;
    int width;
    int index = 0;
    int[] xx = new int[10];
    int[] yy = new int[10];
    int[] ww = new int[10];
    Color[] cc = new Color[10];
    
  
    
    public void init()
    {
        this.addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
        // your code goes here
       
    }
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited (MouseEvent e) {}
    public void mousePressed (MouseEvent e) {
        x = e.getX();
        y = e.getY();
        Color c = new Color ((int) (Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        width = ( (int) Math.random() * 100);
        xx[index] = x;
        yy[index] = y;
        cc[index] = c;
        ww[index] = width;
        if (index < 10) {
            index ++;
        }
        else {
            index = 0;
        }
        repaint();
    }
    public void mouseReleased (MouseEvent e) {}
    
    public void paint(Graphics g)
    {
        // your code goes here

        for (int i = 0; i < 10; i++){
            g.setColor(cc[i]);
            g.fillOval(xx[i],yy[i],ww[i],ww[i]);
            
        }
    }
}