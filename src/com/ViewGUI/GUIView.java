package com.ViewGUI;

import com.Controller.Controller;
import com.JAVABean.MapData.MapData;
import com.Model.ModelSubject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Evilina on 2016/3/30.
 */
public class GUIView extends JFrame implements Observer
{
    private JPanel jPanel;
    private Controller controller;
    private ModelSubject modelSubject;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 300;
    public JTextField jTextField;

    public GUIView(Controller controller, ModelSubject modelSubject)
    {
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        createView();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.controller = controller;
        this.modelSubject = modelSubject;
        modelSubject.addObserver(this);

    }

    private void createView() {
        jPanel = new JPanel();
        this.add(jPanel);
        makeButton("1",Color.black);
        makeButton_2();
        JMenuBar jMenuBar = new JMenuBar();
        rootPane.setJMenuBar(jMenuBar);
        JMenu editMenu = new JMenu("File");
        jMenuBar.add(editMenu);
        JMenuItem openItem = new JMenuItem("Open");
        editMenu.add(openItem);
        jTextField = new JTextField(4);
        jPanel.add(jTextField);
    }

    public void makeButton(String name,final Color backgroundColor)
    {

        JButton aButton = new JButton(name);
        jPanel.add(aButton);


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

    public void makeButton_2() {
        JButton aButton = new JButton("test");
        jPanel.add(aButton);
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.getMapDataByID(1);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void printMapData(MapData mapData)
    {

    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ModelSubject)
        {
            ModelSubject modelSubject = (ModelSubject) o;

        }
        if (arg instanceof MapData)
        {
            MapData mapData = (MapData) arg;
            System.out.println("hello");
        }
    }
}
