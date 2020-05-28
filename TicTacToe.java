import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * hellos
 */
/**
 * TicTacToe
 */
public class TicTacToe {
  static ArrayList<Integer> playerpos = new ArrayList<Integer>();
  static ArrayList<Integer> cpupos = new ArrayList<Integer>();
  public static void main(String[] args) {
    char[][] gameBoard = {
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
      { '-', '+', '-', '+', '-' },
      { ' ', '|', ' ', '|', ' ' },
    };
    printGameBoard(gameBoard);
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your placement (1-9)");
    int pos = scan.nextInt();
    System.out.println(pos);
    Random rand = new Random();
    int cpuPos = rand.nextInt(9) + 1; 
    place(gameBoard, pos, "player");
    place(gameBoard, cpuPos, "cpu");
  }

  

  public static void printGameBoard(char[][] gameBoard) {
    for (char[] row : gameBoard) {
      for (char c : row) {
        System.out.print(c);
      }
      System.out.println();
    }
    
  }



  public static void place(char[][] gameBoard, int pos, String user) {
      char symbol = ' ';
      if(user.equals("player")){
          symbol ='X';
      } else if (user.equals("cpu")) {
        symbol = 'O';
      }
    switch (pos) {
      case 1:
        gameBoard[0][0] = symbol;
        break;
      case 2:
        gameBoard[0][2] = symbol;
        break;
      case 3:
        gameBoard[0][4] = symbol;
        break;
      case 4:
        gameBoard[2][0] = symbol;
        break;
      case 5:
        gameBoard[2][2] = symbol;
        break;
      case 6:
        gameBoard[2][4] = symbol;
        break;
      case 7:
        gameBoard[4][0] = symbol;
        break;
      case 8:
        gameBoard[4][2] = symbol;
        break;
      case 9:
        gameBoard[4][4] = symbol;
        break;
    }
    printGameBoard(gameBoard);
  }
}
