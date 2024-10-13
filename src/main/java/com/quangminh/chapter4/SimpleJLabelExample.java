package com.quangminh.chapter4;

import javax.swing.*;

public class SimpleJLabelExample {
    public static void main(String[] args) {
        JLabel label = new JLabel(" A very Simple Text Label");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }
}
