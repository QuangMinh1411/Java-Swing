package com.quangminh.chapter7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class IconEditor extends JLabel implements ChangeListener {
    JSpinner spinner;
    Icon icon;

    public IconEditor(JSpinner s) {
        super((Icon)s.getValue( ), CENTER);
        icon = (Icon)s.getValue( );
        spinner = s;
        spinner.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent ce) {
        icon = (Icon)spinner.getValue( );
        setIcon(icon);
    }

    public JSpinner getSpinner( ) { return spinner; }
    public Icon getIcon( ) { return icon; }
}
