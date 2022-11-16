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
        JButton[] jButtons = createButtons(buttons);
        addButtons(panel, jButtons);
        BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(box);
        add(panel);

        JPanel panel2 = new JPanel();
        String[] newButtons = { "A", "B", "C" };
        JButton[] jButtons2 = createButtons(newButtons);
        addButtons(panel2, jButtons2);
        BoxLayout box2 = new BoxLayout(panel2, BoxLayout.X_AXIS);
        panel2.setLayout(box2);
        add(panel2);
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
