package me.jonas.chess.swing;

import javax.swing.*;
import java.awt.*;

public class ChessBoardPanel extends JPanel {

    private final int boardSize = 8, squareSize = 60;

    @Override
    protected void paintComponent(Graphics g) {


        for (int row = 0; row < boardSize; row++){
             for (int col = 0; col < boardSize; col++){
                 if ((col + row) %2 == 0){
                     g.setColor(Color.WHITE);
                 } else {
                     g.setColor(Color.DARK_GRAY);
                 }

                 g.fillRect(col * squareSize, row * squareSize, squareSize, squareSize);
             }
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(boardSize * squareSize, boardSize * squareSize);
    }
}
