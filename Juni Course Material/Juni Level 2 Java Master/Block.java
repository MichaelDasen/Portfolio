
import java.awt.*;
import javax.swing.*;

/**
 * Class Block - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Block extends JApplet
{
    // instance variables - replace the example below with your own
    int row;
    int column;
    Color c;
    
    
    
    public Block(int row, int column, Color c) {
       this.row = row;
       this.column = column;
       this.c = c;
    }
    
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }
    public Color getColor() {
        return c;
    }
    public void setRow(int r) {
        row = r;
    }
    public void setColor(Color cc) {
        c = cc;
    }
    public void setColumn(int cl) {
        column = cl;
    }
}
