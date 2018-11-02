package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();


    public static void main(String[] args) {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);
        file.add(new JMenuItem("Open", 'O'));
        JMenuItem save = file.add(new JMenuItem("Save", 'S'));
        save.setEnabled(false);
        file.addSeparator();
        JMenuItem exit = file.add(new JMenuItem("Exit", 'E'));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
        edit.add(new JMenuItem("Cut", 'C'));
        edit.add(new JMenuItem("Copy", 'o'));
        JMenu options=  new JMenu("Options") ;
        edit.add(options);
        options.add("One");
        options.add("Two");
        edit.add(new JCheckBoxMenuItem("checkBox"));
        ButtonGroup buttonGroup=new ButtonGroup();
        JRadioButtonMenuItem jRadioButtonMenuItem1=new JRadioButtonMenuItem("Radio 1" );
        JRadioButtonMenuItem jRadioButtonMenuItem2=new JRadioButtonMenuItem( "Radio 2");
        buttonGroup.add(jRadioButtonMenuItem1);
        buttonGroup.add(jRadioButtonMenuItem2);
        edit.add (jRadioButtonMenuItem1);
        edit.add (jRadioButtonMenuItem2);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();


    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
