package com.Controller;

import com.Model.ModelSubject;
import com.ViewGUI.GUIView;

import java.awt.*;

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
        guiView.jTextField.setText(model.getMapDataByID(id).toString());

    }
}
