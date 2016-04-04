package com.Controller;

import com.Model.Model;
import com.ViewGUI.GUIView;

/**
 * Created by Evilina on 2016/4/3.
 */
public class Controller
{
    private GUIView guiView;
    private Model model;

    public Controller(GUIView guiView, Model model)
    {
        this.guiView = guiView;
        this.model = model;
    }

}
