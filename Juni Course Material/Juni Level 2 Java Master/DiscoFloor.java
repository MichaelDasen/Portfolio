
import java.awt.*;
import javax.swing.*;

/**
 * Class DiscoFloor - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class DiscoFloor extends JApplet implements Runnable
{
    Block[][] floor;
    Thread t;
    public void start() {
       t = new Thread(this);
       t.start();  
        
        
        
       floor = new Block[20][20];
       for (int i = 0; i < 20; i++) {
           for (int j = 0; j < 20; j ++) {
               
               Block b = new Block((int) (Math.random()*20),(int) (Math.random()*20), Color.white);
               floor[i][j] = b;
            }
        }
    }
    
    public void run() {
        while (true) {
           Block b = new Block((int) (Math.random()*20),(int) (Math.random()*20), new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
           floor[b.getRow()][b.getColumn()] = b;
           repaint();
           try{Thread.sleep(100);}
           catch(Exception e)
           {}
        }   
    }
    public void paint(Graphics g) {
        // your code goes here
        
        
        
        
        
        for (int i = 0; i < 20; i++) {
           for (int j = 0; j < 20; j ++) {
               g.setColor(floor[i][j].getColor());
               g.fillRect(floor[i][j].getRow()*50,floor[i][j].getColumn()*50,50,50);
           }
        }

        
        
    }
}
