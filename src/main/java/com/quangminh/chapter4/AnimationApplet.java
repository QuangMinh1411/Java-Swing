package com.quangminh.chapter4;

import javax.swing.*;
import java.applet.Applet;

public class AnimationApplet extends JApplet {
    public void init() {
        ImageIcon icon = new ImageIcon("src/main/java/com/quangminh/chapter4/images/rolling.giff");  // animated gif
        getContentPane().add(new JLabel(icon));
    }

}
