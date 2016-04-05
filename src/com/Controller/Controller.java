package com.Controller;

import com.JAVABean.MapData.MapData;
import com.Model.ModelSubject;
import com.ViewGUI.GUIView;

import java.awt.*;
import java.util.Map;
import java.util.Vector;

/**
 * Created by Evilina on 2016/4/3.
 */
public class Controller
{
    private GUIView guiView;
    private ModelSubject model;

    public Controller( ModelSubject model)
    {
        this.model = model;
        guiView = new GUIView(this,model);
        System.out.println("");
    }

    public void getMapDataByID(int id) throws Exception {
        //guiView.jTextField.setText(model.getMapDataByID(id).toString());
        MapData mapData = model.getMapDataByID(id);
        Vector v = new Vector();
        v.add(mapData.getId() + 1);
        v.add(mapData.getName());
        v.add(mapData.getStation()[0]);
        v.add(mapData.getStation()[1]);
        v.add(mapData.getStation()[2]);
        v.add(mapData.getStation()[3]);
        guiView.tableModel.addRow(v);

    }

    public void getAllMapData() throws Exception {
        java.util.List<MapData> list = model.getAllMapData();
        for (MapData mapData: list
             ) {
            Vector v = new Vector();
            v.add(mapData.getId() + 1);
            v.add(mapData.getName());
            v.add(mapData.getStation()[0]);
            v.add(mapData.getStation()[1]);
            v.add(mapData.getStation()[2]);
            v.add(mapData.getStation()[3]);
            guiView.tableModel.addRow(v);
        }

    }
}
