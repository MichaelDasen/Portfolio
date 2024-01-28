
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
/**
 * Class TicTacToe - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class TicTacToe extends Applet implements MouseListener
{
    String[][] board = new String[3][3];
    boolean xturn = true;
    int x;
    int y;
    boolean game = true;
    int inRow;
    int inRoww;
    int filled = 0;
    public void init() {
        addMouseListener(this);
        
    }
    public void mouseClicked (MouseEvent e){}
    public void mouseEntered (MouseEvent e) {}
    public void mouseExited (MouseEvent e) {}
    public void mousePressed (MouseEvent e) {
        x = e.getX();
        y = e.getY();
        if (game != false) {
            if (xturn == true && board[y/100][x/100] == null) {
                board[y/100][x/100] = "x";
                xturn = false;
            }
            else if (xturn == false && board[y/100][x/100] == null) {
                board[y/100][x/100] = "o";
                xturn = true;
            }
        }
        repaint();
    }
    
    public void mouseReleased (MouseEvent e) {}
    
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0,0,300,300);
        g.setColor(Color.white);
        g.drawLine(100,0,100,300);
        g.drawLine(200,0,200,300);
        g.drawLine(0,100,300,100);
        g.drawLine(0,200,300,200);
       
        for (int i = 0; i < 3;i++){
                for (int j = 0; j < 3;j++){
                    
                    if (board[i][j] != null) {
                        g.setColor(Color.white);
                        g.drawString(board[i][j],j*100+50,i*100+50);
                    }
                }
         }
         
        // columns
        for (int i = 0; i <3;i++) {
        
                if (board[0][i] == "x" && board[1][i] == "x" && board[2][i] == "x"){
                    g.drawString("Game Over! Player 1 wins!",150,300);
                    game = false;
                }
                else if (board[0][i] == "o"  && board[1][i] == "o" && board[2][i] == "o"){
                    g.drawString("Game Over! Player 2 wins!",150,300);
                    game = false;
                }
          }
            
            
          
       
        
        
        //rows5
        for (int i = 0; i <3;i++) {
           
                if (board[i][0] == "x" && board[i][1] == "x" && board[i][2] == "x"){
                    g.drawString("Game Over! Player 1 wins!",150,300);
                    game = false;
                }
                else if (board[i][0] == "o" && board[i][1] == "o" && board[i][2] == "o"){
                    g.drawString("Game Over! Player 2 wins!",150,300);
                    game = false;
                }
           
        }
        //diagonals
        if (board[0][0] == "x" && board[1][1] == "x" && board[2][2] == "x") {
             g.drawString("Game Over! Player 1 wins!",150,300);
             game = false;
        }
        if (board[0][0] == "o" && board[1][1] == "o" && board[2][2] == "o") {
             g.drawString("Game Over! Player 2 wins!",150,300);
             game = false;
        }
        
        if (board[2][0] == "x" && board[1][1] == "x" && board[0][2] == "x") {
             g.drawString("Game Over! Player 1 wins!",150,300);
             game = false;
        }
        if (board[2][0] == "o" && board[1][1] == "o" && board[0][2] == "o") {
             g.drawString("Game Over! Player 2 wins!",150,300);
             game = false;
        }
        //tie game
        if (game != false){ 
            for (int i = 0; i < 3;i++){
                for (int j = 0; j < 3;j++){
                    if (board[i][j] == "o" || board[i][j] == "x") {
                       filled += 1;
                       
                    }
                }
            }
            if (filled == 9) {
                game = false;
                g.drawString("Game Over! It's a tie!",150,300);
            }
            filled = 0;
        }
    }
    }

