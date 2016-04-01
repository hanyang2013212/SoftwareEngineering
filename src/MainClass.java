/**
 * Created by Evilina on 2016/3/28.
 */

import com.GUI.GUITest;
import com.MapData.MapData;
import com.MapData.ReadMap;

import java.awt.*;
import javax.swing.*;


public class MainClass {


    public static void main(String[] args)
    {
        MapData mapData = new MapData(0, "1", 0);
        String a = new ReadMap().BuildJson("1", mapData);
        new ReadMap().pareseJson(a);


        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                GUITest frame = new GUITest();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
