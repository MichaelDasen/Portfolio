
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AppletName2 extends Applet implements KeyListener
{
    int x;
    int y;
    int size;
    int m;
    int mouth;
    int bx;
    int by;
    int points;
    public void init()
    {
        addKeyListener(this);
        setBackground(Color.black);
        x = 100;
        y = 100;
        size = 100;
        m = 225;
        mouth = 270;
        bx = (int) (Math.random() * 100);
        by = (int) (Math.random() * 100);
        points = 0;
    
    }
    
    public void keyPressed(KeyEvent e)
    {
        // your code goes here
       
        int k = e.getKeyCode();
        if (k == e.VK_DOWN){
            y+=50;
            m = 315;
            mouth = 270;
        }
        if (k == e.VK_UP){
            y-=50;
            m = 135; 
            mouth = 270;
        }
        if (k == e.VK_RIGHT){
            x+=50;
            m = 45;
            mouth = 270;
        }
        if (k == e.VK_LEFT){
            x-=50;
            m = 225;
            mouth = 270;
        }
        if (bx >= x && bx <= x+70 && by >= y && by <= y+70) {
            points += 1; 
            bx = (int) (Math.random() * 500);
            by = (int) (Math.random() * 500);
        }
        repaint();
    }
    
    public void keyReleased (KeyEvent e) {}
    
    public void keyTyped (KeyEvent e) {}

    public void paint(Graphics g) {
        // your code goes here
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillArc(x,y,size,size,m,mouth);
        g.setColor(Color.red);
        g.fillOval(bx,by,30,30);
        g.setFont(new Font("TimesRoman",Font.PLAIN,30));
        g.drawString("Points: " + points,50,50);
    }
}