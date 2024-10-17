package com.quangminh.chapter5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonEvent {
    public static void main(String[] args) {
        JToggleButton jtb = new JToggleButton("Press Me");

        jtb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                System.out.println("ActionEvent!");
            }
        });
        jtb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ev) {
                System.out.println("ItemEvent!");
            }
        });
        jtb.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent ev) {
                System.out.println("ChangeEvent!");
            }
        });
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(jtb);
        f.pack();
        f.setVisible(true);
    }

}
