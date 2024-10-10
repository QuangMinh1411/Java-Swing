package com.quangminh.chapter2;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CopyAction extends AbstractAction {
    SiteManager manager;

    public CopyAction(SiteManager sm) {
        super("", new ImageIcon("src/main/java/com/quangminh/chapter2/copy.gif"));
        manager = sm;
    }

    public void actionPerformed(ActionEvent ae) {
        JInternalFrame currentFrame = manager.getCurrentFrame();
        if (currentFrame == null) {
            return;
        }
        // can't cut or paste sites
        if (currentFrame instanceof SiteFrame) {
            return;
        }
        ((PageFrame) currentFrame).copyText();
    }

}
