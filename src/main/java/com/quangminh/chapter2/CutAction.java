package com.quangminh.chapter2;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class CutAction extends AbstractAction {
    SiteManager manager;

    public CutAction(SiteManager sm) {
        super("", new ImageIcon("src/main/java/com/quangminh/chapter2/cut.gif"));
        manager = sm;
    }

    public void actionPerformed(ActionEvent ae) {
        JInternalFrame currentFrame = manager.getCurrentFrame();
        if (currentFrame == null) {
            return;
        }
        // cannot cut or paste sites
        if (currentFrame instanceof SiteFrame) {
            return;
        }
        ((PageFrame) currentFrame).cutText();
    }

}
