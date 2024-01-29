// Main.java
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      char[][] arr = new char[10][10];
      for (int i = 0; i < 10; i++) {
    	  for (int j = 0; j < 10; j++) {
    	    arr[i][j] = '-';
    	  }
    	}
    	char[][] board = new char[10][10];
    	boolean[][] fired = new boolean[10][10];
    	for (int i = 0; i < 10; i++) {
    	  for (int j = 0; j < 10; j++) {
    	    board[i][j] = '-';
    	  }
    	}
    	board[0][0] = 'X';
    	board[0][1] = 'X';
    	board[0][2] = 'X';
    	while (check(board,arr) == false) {
      	Scanner fire = new Scanner(System.in);
      	System.out.println("What row do you want to chose?");
      	int row = fire.nextInt();
      	System.out.println("What column do you want to chose?");
      	int column = fire.nextInt();
      	printer(row,column,board,fired,arr);
      	fired[row][column] = true;
    	}
    	System.out.println("You sank all the battleships! :)");
    }
    
    public static void printer(int row, int column, char[][] board, boolean[][]fired, char[][] arr) {
    	if (fired[row][column] == false) {
    	  if (board[row][column] == 'X') {
    	    arr[row][column] = 'X';
    	    System.out.println("Hit!");
    	  }
    	}
    	else {
    	  System.out.println("Miss!");
    	}
    	System.out.println(" 0123456789");
    	for (int i = 0; i < 10; i++) {
    	  System.out.print(i);
    	  for (int j = 0; j < 10; j++) {
    	    System.out.print(arr[i][j]);
    	  }
    	  System.out.println();
    	}
    }
    public static boolean check(char[][] board, char[][] arr) {
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          if (board[i][j] == 'X') {
            if (arr[i][j] != 'X') {
              return false;
            }
          }
        }
      }
      return true;
    }
    
}
