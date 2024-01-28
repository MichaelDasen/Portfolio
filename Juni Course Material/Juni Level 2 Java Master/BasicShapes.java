
import java.awt.*;
import java.applet.Applet;

/**
 * Class BasicShapes - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class BasicShapes extends Applet
{
    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g)
    {
        // simple text displayed on applet
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //g.setColor(Color.red);
        //g.fillOval(300,400,450,550);
        //g.setColor(Color.blue);
        //g.fillArc(100,100,300,150,45,180);
        //g.setColor(Color.green);
        //g.fillOval(100,50,50,50);
        //g.fillOval(300,50,50,50);
       // g.fillArc(50,100,350,175,0,-180);
       //for (int i = 0; i < 500; i++) {
           //int s = (int) (Math.random() * 3 + 1);
           //if (s == 1) {
              // ovals(g);
            //}
           //else if (s == 2) {
             //  rectangles(g);
            //}
           //else {
               //pacman(g);
          //  }
        //}
       //
       
       
       
       //g.setColor(Color.cyan);
       
       //for  (int i = 0 ; i <= 500; i+= 50) {
          //g.fillOval(i,i,50,50);
        //}
       //int b = 0;
       //for  (int i = 500 ; i >= 0; i-= 50) {
          //g.fillOval(i,b,50,50);
          //b += 50;
        //}
        
        //String s1 = "Hello";
        ///String s2 = "Hello";
        
        //if (s1.equals(s2)) {
            //System.out.println("Hello");
        //}
        //String shape = "pacman";
        //if (shape.equals("pacman")){
            //g.setColor(Color.yellow);
            //g.fillArc(100,100,200,200,45,270);
        //}
        //if(shape.equals("circle")){
            //g.setColor(Color.blue);
            //g.fillOval(100,100,200,200);
        //}
        //if (shape.equals("rec")){
            //g.setColor(Color.red);
            //g.fillRect(100,100,200,200);
        //}    
        // not: !
        // equal: ==
        // and: &&
        // or: ||
        // == <=, >=, >, <, !=
        // str1.equals(str2)
        /*
        if (1 == 1) {
            code...
        } 
        else if (2 == 1) {
            code...
        } 
        else {
            code...
        }
        */
       
    }
    public static void ovals(Graphics g) {
        int size = (int) (Math.random() * 100);
        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int color = (int) (Math.random() * 5 + 1);
        if (color == 1) {
            g.setColor(Color.red);
        }
        else if(color == 2) {
            g.setColor(Color.blue);
        }
        else if(color == 3) {
            g.setColor(Color.yellow);
        }
        else if(color == 4) {
            g.setColor(Color.blue);
        }
        else if(color == 5) {
            g.setColor(Color.green);
        }
        g.fillOval(x,y,size,size);

    }
    public static void rectangles(Graphics g) {
        int size = (int) (Math.random() * 100);
        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int color = (int) (Math.random() * 5 + 1);
        if (color == 1) {
            g.setColor(Color.red);
        }
        else if(color == 2) {
            g.setColor(Color.blue);
        }
        else if(color == 3) {
            g.setColor(Color.yellow);
        }
        else if(color == 4) {
            g.setColor(Color.blue);
        }
        else if(color == 5) {
            g.setColor(Color.green);
        }
        g.fillRect(x,y,size,size);

    }
    public static void pacman(Graphics g) {
        int size = (int) (Math.random() * 100);
        int x = (int) (Math.random() * 1000);
        int y = (int) (Math.random() * 1000);
        int color = (int) (Math.random() * 5 + 1);
        if (color == 1) {
            g.setColor(Color.red);
        }
        else if(color == 2) {
            g.setColor(Color.blue);
        }
        else if(color == 3) {
            g.setColor(Color.yellow);
        }
        else if(color == 4) {
            g.setColor(Color.blue);
        }
        else if(color == 5) {
            g.setColor(Color.green);
        }
        g.fillArc(x,y,size,size,45,270);

    }
}
