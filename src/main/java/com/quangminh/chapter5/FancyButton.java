package com.quangminh.chapter5;

import javax.swing.*;
import java.awt.*;

public class FancyButton extends JButton {
    public FancyButton(Icon icon, Icon pressed, Icon rollover) {
        super(icon);
        setFocusPainted(false);
        setRolloverEnabled(true);
        setRolloverIcon(rollover);
        setPressedIcon(pressed);
        setBorderPainted(false);
        setContentAreaFilled(false);
    }

    // A simple test program
    public static void main(String[] args) {

        FancyButton b1 = new FancyButton(
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/redcube.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/redpaw.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/reddiamond.gif"));
        FancyButton b2 = new FancyButton(
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/bluecube.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/bluepaw.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter5/images/bluediamond.gif"));
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(b1);
        c.add(b2);
        f.pack();
        f.setVisible(true);
    }

}
