package com.quangminh.chapter7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListExample extends JPanel {
    private BookEntry books[] = {
            new BookEntry("Ant: The Definitive Guide", "src/main/java/com/quangminh/chapter7/covers/ant.gif"),
            new BookEntry("Database Programming with JDBC and Java",
                    "src/main/java/com/quangminh/chapter7/covers/jdbc.gif"),
            new BookEntry("Developing Java Beans", "src/main/java/com/quangminh/chapter7/covers/beans.gif"),
            new BookEntry("Developing JSP Custom Tag Libraries",
                    "src/main/java/com/quangminh/chapter7/covers/jsptl.gif"),
            new BookEntry("Java 2D Graphics", "src/main/java/com/quangminh/chapter7/covers/java2d.gif"),
            new BookEntry("Java and XML", "src/main/java/com/quangminh/chapter7/covers/jxml.gif"),
            new BookEntry("Java and XSLT", "src/main/java/com/quangminh/chapter7/covers/jxslt.gif"),
            new BookEntry("Java and SOAP", "src/main/java/com/quangminh/chapter7/covers/jsoap.gif"),
            new BookEntry("Java and XML Data Binding", "src/main/java/com/quangminh/chapter7/covers/jxmldb.gif"),
            new BookEntry("Java Cookbook", "src/main/java/com/quangminh/chapter7/covers/jcook.gif"),
            new BookEntry("Java Cryptography", "src/main/java/com/quangminh/chapter7/covers/jcrypto.gif"),
            new BookEntry("Java Distributed Computing", "src/main/java/com/quangminh/chapter7/covers/jdist.gif"),
            new BookEntry("Java I/O", "src/main/java/com/quangminh/chapter7/covers/javaio.gif"),
            new BookEntry("Java in a Nutshell", "src/main/java/com/quangminh/chapter7/covers/javanut.gif"),
            new BookEntry("Java Management Extensions", "covers/jmx.gif"),
            new BookEntry("Java Message Service", "src/main/java/com/quangminh/chapter7/covers/jms.gif"),
            new BookEntry("Java Network Programming", "src/main/java/com/quangminh/chapter7/covers/jnetp.gif"),
            new BookEntry("Java Performance Tuning", "src/main/java/com/quangminh/chapter7/covers/jperf.gif"),
            new BookEntry("Java RMI", "src/main/java/com/quangminh/chapter7/covers/jrmi.gif"),
            new BookEntry("Java Security", "src/main/java/com/quangminh/chapter7/covers/jsec.gif"),
            new BookEntry("JavaServer Pages", "src/main/java/com/quangminh/chapter7/covers/jsp.gif"),
            new BookEntry("Java Servlet Programming", "src/main/java/com/quangminh/chapter7/covers/servlet.gif"),
            new BookEntry("Java Swing", "src/main/java/com/quangminh/chapter7/covers/swing.gif"),
            new BookEntry("Java Threads", "src/main/java/com/quangminh/chapter7/covers/jthread.gif"),
            new BookEntry("Java Web Services", "src/main/java/com/quangminh/chapter7/covers/jws.gif"),
            new BookEntry("Learning Java", "src/main/java/com/quangminh/chapter7/covers/learnj.gif")
    };

    private JList booklist = new JList(books);

    public ListExample() {
        setLayout(new BorderLayout());
        JButton button = new JButton("Print");
        button.addActionListener(new PrintListener());

        booklist = new JList(books);
        booklist.setCellRenderer(new BookCellRenderer());
        booklist.setVisibleRowCount(4);
        JScrollPane pane = new JScrollPane(booklist);

        add(pane, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("List Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new ListExample());
        frame.pack();
        frame.setVisible(true);
    }

    // An inner class to respond to clicks on the Print button
    class PrintListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int selected[] = booklist.getSelectedIndices();
            System.out.println("Selected Elements:  ");

            for (int i=0; i < selected.length; i++) {
                BookEntry element =
                        (BookEntry)booklist.getModel().getElementAt(selected[i]);
                System.out.println("  " + element.getTitle());
            }
        }
    }

}
