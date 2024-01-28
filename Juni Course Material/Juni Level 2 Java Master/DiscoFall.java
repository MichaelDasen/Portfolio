import java.awt.*;
import java.applet.Applet;


/**
 * Class DiscoFall - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class DiscoFall extends Applet implements Runnable
{
    Block[][] floor = new Block[20][20];
    Thread t;
    public void start() {
       t = new Thread(this);
       t.start();  
      
    }
    
    public void run() {
        
        while (true) {
           int row = 0;
           int col = (int) (Math.random()*20);
           Block c = new Block (row,col,new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
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
               row += 1;
               repaint();
               try{Thread.sleep(100);}
               catch(Exception e)
               {}
           }
           
           
        }   
    }
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
