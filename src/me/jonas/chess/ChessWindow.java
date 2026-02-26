package me.jonas.chess;

import javax.swing.*;
import java.awt.*;

public class ChessWindow {

    public ChessWindow() {
        final JFrame jFrame = new JFrame("Chess Game");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(new ChessBoardPanel(), BorderLayout.CENTER);

        final JPanel buttonPannel = new JPanel();
        buttonPannel.setLayout(new FlowLayout());

        final JButton computerButtonWhite = new JButton("Make move white");
        final JButton computerButtonBlack = new JButton("Make move black");
        final JButton ResetButton = new JButton("Reset Board");

        buttonPannel.add(computerButtonWhite);
        buttonPannel.add(computerButtonBlack);
        buttonPannel.add(ResetButton);

        jFrame.add(buttonPannel, BorderLayout.SOUTH);

        jFrame.setResizable(false);
        jFrame.setVisible(true);
        jFrame.pack();
    }
}
