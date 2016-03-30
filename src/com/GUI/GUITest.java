package com.GUI;

import com.ENUM.ColorTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evilina on 2016/3/30.
 */
public class GUITest extends JFrame
{
    private JPanel jPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;

    public GUITest()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // create buttons
        JButton aButton = new JButton();

        // add button to panel
        jPanel = new JPanel();
        jPanel.add(aButton);

        // add panel to frame
        this.add(jPanel);


        // create button actions
        TestAction testAction = new TestAction(Color.RED);

        // associate actions with buttons
        aButton.addActionListener(testAction);
    }

    private class TestAction implements ActionListener
    {
        private Color backgroundColor;
        public TestAction(Color c)
        {
            this.backgroundColor = c;
        }


        @Override
        public void actionPerformed(ActionEvent e)
        {
            jPanel.setBackground(backgroundColor);
        }
    }

}
