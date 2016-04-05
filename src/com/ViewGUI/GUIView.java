package com.ViewGUI;

import com.Controller.Controller;
import com.JAVABean.MapData.MapData;
import com.Model.ModelSubject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

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
    private JTable jTable;

    public DefaultTableModel tableModel;

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
        //makeButton_2();
        JMenuBar jMenuBar = new JMenuBar();
        rootPane.setJMenuBar(jMenuBar);
        JMenu editMenu = new JMenu("File");
        jMenuBar.add(editMenu);
        JMenuItem openItem = new JMenuItem("getTheStation");
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
//                    controller.getMapDataByID(1);
                    controller.getAllMapData();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        editMenu.add(openItem);
        jTextField = new JTextField(4);
        jPanel.add(jTextField);
        makeJTable();
        this.pack();
    }

    public void makeJTable() {
        String[] tableNames = {"id","Name","Station1","Station2","Station3","Station4"};
        String[][] data = new String[6][6];
        Vector v = new Vector();
        v.add("id");
        v.add("Name");
        v.add("station1");
        v.add("station2");
        v.add("station3");
        v.add("station4");
        tableModel = new DefaultTableModel(v, 0);
        jTable = new JTable(tableModel);
        jPanel.add(new JScrollPane(jTable));

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
//                    controller.getMapDataByID(1);
                    controller.getAllMapData();
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

