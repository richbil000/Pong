import javax.swing.*;
import java.awt.*;


public class Game {

        JFrame frame;
        Board board;

        public Game(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("PONG");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        board = new Board();
        frame.add(board);
        frame.pack();
        frame.setLocationRelativeTo(null);
    }


    public static void main(String[] args){Game game = new Game();}

    if(keyEvent.getKeyCode() == KeyEvent.VK_P){
            board.reset();
        }
}
