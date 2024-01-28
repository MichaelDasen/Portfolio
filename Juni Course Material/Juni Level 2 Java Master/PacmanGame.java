


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PacmanGame extends Applet implements KeyListener, Runnable
{
    int x;
    int y;
    int size;
    int m;
    int bx;
    int by;
    int points;
    boolean open;
    Thread t;
    public void init()
    {
        addKeyListener(this);
        setBackground(Color.black);
        x = 100;
        y = 100;
        size = 100;
        m = 225;
        bx = (int) (Math.random() * 100);
        by = (int) (Math.random() * 100);
        points = 0;
        open = true;
        
        
        t = new Thread(this);
        t.start();
    
    }
    public void run(){
         while (true) {
            if (m == 315 && y <= 500) {
                y += 10;
            }
            if (m == 135 && y >= 0) {
                y -= 10;
            }
            if (m == 45 && x <= 500){
                x += 10;
            }
            if (m == 225 && x >= 0) {
                x -= 10;
            }
            open = !open;
            repaint();
            try{Thread.sleep(200);}
           catch(Exception e)
           {}
         }
    }
    public void keyPressed(KeyEvent e)
    {
        // your code goes here
       
        int k = e.getKeyCode();
        if (k == e.VK_DOWN){
            m = 315;
        }
        if (k == e.VK_UP){
            m = 135;
        }
        if (k == e.VK_RIGHT){
            m = 45;
        }
        if (k == e.VK_LEFT){
            m = 225;
        }
        if (bx >= x && bx <= x+50 && by >= y && by <= y+50) {
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
        if(open == true) {
            g.fillArc(x,y,size,size,m,270);
        }
        else {
            g.fillOval(x,y,size,size);
        }
        g.setColor(Color.red);
        g.fillOval(bx,by,30,30);
        g.setFont(new Font("TimesRoman",Font.PLAIN,30));
        g.drawString("Points: " + points,50,50);
    }
}