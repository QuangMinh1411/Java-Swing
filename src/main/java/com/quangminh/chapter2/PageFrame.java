package com.quangminh.chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

public class PageFrame extends JInternalFrame implements ActionListener {
    SiteManager parent;
    String filename;
    JTextArea ta;

    public PageFrame(String name, SiteManager sm) {
        super("Page: " + name, true, true, true, true);
        parent = sm;
        setBounds(50, 50, 300, 150);

        Container contentPane = getContentPane();

        // Create a text area to display the contents of our file in
        // and stick it in a scrollable pane so we can see everything
        ta = new JTextArea();
        JScrollPane jsp = new JScrollPane(ta);
        contentPane.add(jsp, BorderLayout.CENTER);

        JMenuBar jmb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        fileMenu.add(saveItem);
        jmb.add(fileMenu);
        setJMenuBar(jmb);

        filename = name;
        loadContent();
    }

    public void actionPerformed(ActionEvent ae) {
        // Can only be the save menu
        saveContent();
    }

    public void loadContent() {
        try {
            FileReader fr = new FileReader(filename);
            ta.read(fr, null);
            fr.close();
        } catch (Exception e) {
            System.err.println("Could not load page: " + filename);
        }
    }

    public void saveContent() {
        try {
            FileWriter fw = new FileWriter(filename);
            ta.write(fw);
            fw.close();
        } catch (Exception e) {
            System.err.println("Could not save page: " + filename);
        }
    }

    public void cutText() {
        ta.cut();
    }

    public void copyText() {
        ta.copy();
    }

    public void pasteText() {
        ta.paste();
    }

}
