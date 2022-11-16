package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Stacker extends JFrame {
    Dimension dim = new Dimension(400,400);

    Stacker(String title, String[] buttons){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(dim);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(box);
        JButton[] jButtons = createButtons(buttons);
        addButtons(panel, jButtons);
        add(panel);
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

    void addButtons(JPanel panel, JButton[] buttons){
        for( JButton btn : buttons ){
            panel.add(btn);
        }
    }

}
