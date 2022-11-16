package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Stacker extends JFrame {
    Dimension dim = new Dimension(300,300);

    Stacker(String title, String[] buttons){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(dim);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    JButton[] createButtons(String[] buttons){
        JButton[] jButtons = new JButton[buttons.length];
        int i = 0;
        for( String text : buttons ){
            JButton btn = new JButton(text);
            jButtons[i] = btn;
            i++;
        }
        return jButtons;
    }

}
