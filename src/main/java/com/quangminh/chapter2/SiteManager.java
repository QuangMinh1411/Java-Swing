package com.quangminh.chapter2;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class SiteManager extends JFrame {
    JLayeredPane desktop;
    Vector popups = new Vector();

    public SiteManager() {
        super("Web Site Manager");
        setSize(450, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        JToolBar jtb = new JToolBar();
        jtb.add(new CutAction(this));
        jtb.add(new CopyAction(this));
        jtb.add(new PasteAction(this));
        contentPane.add(jtb, BorderLayout.NORTH);

        // Add our LayeredPane object for the internal frames.
        desktop = new JDesktopPane();
        contentPane.add(desktop, BorderLayout.CENTER);
        addSiteFrame("Sample");
    }

    public static void main(String[] args) {
        SiteManager mgr = new SiteManager();
        mgr.setVisible(true);
    }

    // Methods to create our internal frames
    public void addSiteFrame(String name) {
        SiteFrame sf = new SiteFrame(name, this);
        popups.addElement(sf);
        desktop.add(sf, Integer.valueOf(2));  // Keep sites on top for now
        sf.setVisible(true);
    }

    public void addPageFrame(String name) {
        PageFrame pf = new PageFrame(name, this);
        desktop.add(pf, Integer.valueOf(1));
        pf.setVisible(true);
        pf.setIconifiable(true);
        popups.addElement(pf);
    }

    public JInternalFrame getCurrentFrame() {
        for (int i = 0; i < popups.size(); i++) {
            JInternalFrame currentFrame = (JInternalFrame) popups.elementAt(i);
            if (currentFrame.isSelected()) {
                return currentFrame;
            }
        }
        return null;
    }

}
