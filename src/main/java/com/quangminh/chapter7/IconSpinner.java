package com.quangminh.chapter7;

import javax.swing.*;
import java.awt.*;

public class IconSpinner extends JFrame {
    public IconSpinner( ) {
        super("JSpinner Icon Test");
        setSize(300,80);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane( );
        c.setLayout(new GridLayout(0,2));

        Icon nums[] = new Icon[] {
                new ImageIcon("src/main/java/com/quangminh/chapter7/1.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter7/2.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter7/3.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter7/4.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter7/5.gif"),
                new ImageIcon("src/main/java/com/quangminh/chapter7/6.gif")
        };
        JSpinner s1 = new JSpinner(new SpinnerListModel(nums));
        s1.setEditor(new IconEditor(s1));
        c.add(new JLabel(" Icon Spinner"));
        c.add(s1);

        setVisible(true);
    }

    public static void main(String args[]) {
        new IconSpinner( );
    }
}
