package com.java21days;

import javax.swing.*;
import java.awt.*;

public class Stacker extends JFrame {
    Dimension dim = new Dimension(300,300);

    Stacker(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(dim);
        setLocationRelativeTo(null);

        setVisible(true);
    }


}
