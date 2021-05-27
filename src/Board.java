import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Board extends JPanel implements ActionListener {

    public Board(){
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
    }

    boolean MENU = true, PLAY = false, GAMROVER = false;

    public void checkCollisions(){

        if (ball.intersects(paddle1) ball.itersects(paddle2)){
            ballDx *=1;
        }
    }
    public void move(){
        if(ballX + BALLD >= getWidth()){
            playerScore += 1;
            init();
            ballDX*=1;
            timer.stop();
        }
        if(){
            computerScore+=1;
            init();
            timer.stop();
        }
    }
    public void startPause(){
        if (timer.isRunning()){
            timer.stop();
        }else{
            timer.start();
        }
    }

    public void reset(){
        playerScore = 0;
        computerScore = 0;
        init();
        repaint();
        Play = true;
        GameOver = false;
        Menu = false;
    }

    public void checkGameOver(){
        if(playerScore >= 2 )
    }



    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.white);

        If(MENU){
            g.drawLine(getWidth()2, 0, getWidth()2, getHeight()/3, g);
            printSimpleString("PONG", getWidth(), 0, getHeight()/3, g);
            printSimpleString("Press P to Play", getWidth(), 0, getHeight()/3 * 2, g);
        }else if(PLAY){
            g.setFont(new Font(Serif, Font.BOLD, 42));
            g.drawLine(getWidth()2, 0, getWidth()2, getHeight());
        }else if(GAMROVER){
            g.setFont(new Font(Serif, Font.BOLD, 42));
        g.drawLine(getWidth()2, 0, getWidth()2, getHeight()/3, g);
        printSimpleString("Game Over", getWidth(), 0, getHeight()/3, g);
        printSimpleString("Press P to play Again", getWidth(), 0, getHeight()/3 * 2, g);
        }


    }

    private void printSimpleString(String s, int width, int XPos, int YPos, Grathics g2d){
        int stringlen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringlen/2;
        g2d.drawString(s, start + XPos, YPos);
    }
}
