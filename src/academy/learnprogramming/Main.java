package academy.learnprogramming;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();                                //Create blank window from
        frame.getContentPane().setBackground(Color.black);          //Create a black border
        frame.setLayout(new GridBagLayout());
        frame.setMinimumSize(new Dimension(1000, 1000)); //Size of the board
        frame.setLocationRelativeTo(null);                            //center jframe


        Board board = new Board();
        frame.add(board);

        frame.setVisible(true);
    }

    


}
