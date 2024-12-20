package com.quangminh.chapter2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ToolBarFrame1 extends Frame {
    Button cutButton, copyButton, pasteButton;

    public ToolBarFrame1() {
        super("Toolbar Example (AWT)");
        setSize(450, 250);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ActionListener printListener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println(ae.getActionCommand());
            }
        };

        Panel toolbar = new Panel();
        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

        cutButton = new Button("Cut");
        cutButton.addActionListener(printListener);
        toolbar.add(cutButton);

        copyButton = new Button("Copy");
        copyButton.addActionListener(printListener);
        toolbar.add(copyButton);

        pasteButton = new Button("Paste");
        pasteButton.addActionListener(printListener);
        toolbar.add(pasteButton);

        // The "preferred" BorderLayout add call
        add(toolbar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        ToolBarFrame1 tf1 = new ToolBarFrame1();
        tf1.setVisible(true);
    }

}
