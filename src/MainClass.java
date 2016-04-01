/**
 * Created by Evilina on 2016/3/28.
 */

import com.GUI.GUITest;
import com.JSON.ConnectToJSON;
import com.MapData.MapData;
import com.MapData.ReadMap;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;


public class MainClass {


    public static void main(String[] args)
    {
//        List<String> station  = new List[];
//        MapData mapData = new MapData(0, "1", );
//        String a = new ReadMap().BuildJson("1", mapData);
        ConnectToJSON con = new ConnectToJSON();
        String a = con.ReadFile("src/data.json");
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
