
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
/**
 * Class BlockGame - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class BlockGame extends Applet implements Runnable, KeyListener
{
   Block[][] floor = new Block[20][20];
    Thread t;
    Block c;
    
    public void start() {
       t = new Thread(this);
       t.start();  
       addKeyListener(this);
    }
    
    public void run() {
        
        while (true) {
           int row = 0;
           int col = (int) (Math.random()*20);
           c = new Block (row,col,new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
           floor[c.getRow()][c.getColumn()] = c;
           //for (int i = 0; i < 19; i++){
               //for (int j = 0; j<20; j++) {
                   //if (floor[i][j].getColor() != Color.white && floor[i+1][j].getColor() == Color.white){
                      // floor[i+1][j] = floor[i][j];
                       //floor[i][j] = new Block(i,j,Color.white);
                       //floor[i+1][j].setRow(i+1);
                   //}
               //} 
           //}
            while(true){
                row = c.getRow();
                col = c.getColumn();
               if (row == 19){
                   break;
               }
               else if (floor[row+1][col] != null) {
                   break;
               }
               else {
                  floor[row][col] = null;
                  floor[row+1][col] = c;
                  c.setRow(row+1);
               }
             
               repaint();
               try{Thread.sleep(100);}
               catch(Exception e)
               {}
           }
           
           
        }   
    }
    public void keyPressed(KeyEvent e)
    {
        // your code goes here
        int r = c.getRow();
        int co = c.getColumn();
        int k = e.getKeyCode();
        
        if (k == e.VK_RIGHT){
            if (co< 19 && floor[r][co+1] == null) {
                floor[r][co] = null;
                floor[r][co+1] = c;
                c.setColumn(co+1);
            }
        }
        if (k == e.VK_LEFT && floor[r][co-1] == null){
            if (co > 0) {
                floor[r][co] = null;
                floor[r][co-1] = c;
                c.setColumn(co-1);
            }
        }
        
        repaint();
    }
    
    public void keyReleased (KeyEvent e) {}
    
    public void keyTyped (KeyEvent e) {}

    public void paint(Graphics g) {
        // your code goes here
        
        
        
        
        
        for (int i = 0; i < 20; i++) {
           for (int j = 0; j < 20; j ++) {
               if (floor[i][j] != null){
               g.setColor(floor[i][j].getColor());
               g.fillRect(floor[i][j].getColumn()*50,floor[i][j].getRow()*50,50,50);
            }
           }
        }

        
        
    }
    
    
    
    
    
}
