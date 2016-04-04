package com.Controller;

import com.Model.ModelSubject;
import com.ViewGUI.GUIView;

/**
 * Created by Evilina on 2016/4/3.
 */
public class Controller
{
    private GUIView guiView;
    private ModelSubject model;

    public Controller(GUIView guiView, ModelSubject model)
    {
        this.guiView = guiView;
        this.model = model;
        System.out.println("");
    }

}
