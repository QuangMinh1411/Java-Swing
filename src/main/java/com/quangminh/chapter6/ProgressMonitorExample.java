package com.quangminh.chapter6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressMonitorExample extends JFrame implements ActionListener {
    static ProgressMonitor pbar;
    static int counter = 0;

    public ProgressMonitorExample() {
        super("Progress Monitor Demo");
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pbar = new ProgressMonitor(null, "Monitoring Progress",
                "Initializing . . .", 0, 100);

        // Fire a timer every once in a while to update the progress.
        Timer timer = new Timer(500, this);
        timer.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        UIManager.put("ProgressMonitor.progressText", "This is progress?");
        UIManager.put("OptionPane.cancelButtonText", "Go Away");
        new ProgressMonitorExample();
    }

    public void actionPerformed(ActionEvent e) {
        // Invoked by the timer every half second. Simply place
        // the progress monitor update on the event queue.
        SwingUtilities.invokeLater(new Update());
    }

    class Update implements Runnable {
        public void run() {
            if (pbar.isCanceled()) {
                pbar.close();
                System.exit(1);
            }
            pbar.setProgress(counter);
            pbar.setNote("Operation is "+counter+"% complete");
            counter += 2;
        }
    }

}
