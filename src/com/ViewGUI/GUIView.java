package com.ViewGUI;

import com.JAVABean.MapData.MapData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evilina on 2016/3/30.
 */
public class GUIView extends JFrame
{
    private JPanel jPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public GUIView()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        jPanel = new JPanel();
        makeButton("1",Color.black);
        JMenuBar jMenuBar = new JMenuBar();
        rootPane.setJMenuBar(jMenuBar);
        JMenu editMenu = new JMenu("File");
        jMenuBar.add(editMenu);
        JMenuItem openItem = new JMenuItem("Open");
        editMenu.add(openItem);


    }

    public void makeButton(String name,final Color backgroundColor)
    {

        JButton aButton = new JButton(name);
        jPanel.add(aButton);
        this.add(jPanel);

        // associate actions with buttons
        aButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                jPanel.setBackground(backgroundColor);
            }
        });
    }

    public void printMapData(MapData mapData)
    {

    }


}
