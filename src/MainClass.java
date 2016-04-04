/**
 * Created by Evilina on 2016/3/28.
 */

import com.Controller.Controller;
import com.JAVABean.Factory.DAOFactory;
import com.JAVABean.MapData.MapData;

import com.Model.MapDataDisplay;
import com.Model.ModelSubject;
import com.ViewGUI.GUIView;

import java.awt.*;
import javax.swing.*;


public class MainClass {


    public static void main(String[] args) throws Exception
    {
        //json测试代码
//        List<String> station  = new List[];
//        MapData mapData = new MapData(0, "1", );
//        String a = new ReadMap().BuildJson("1", mapData);
//        ConnectToJSON con = new ConnectToJSON();
//        String a = con.ReadFile("src/data.json");
//        new ReadMap().pareseJson(a);

        //这是抽象工厂测试代码

//        java.util.List<MapData> list = DAOFactory.getMapDataInstance().findAll("a");
//        System.out.println(list.get(1).toString());
//        System.out.println(DAOFactory.getMapDataInstance().findByID(0));


//        ModelSubject modelSubject = new ModelSubject();
//        MapDataDisplay mapDataDisplay = new MapDataDisplay(modelSubject);
//        modelSubject.getMapDataByID(1);

//不适用eventqueue封装gui事件
//        EventQueue.invokeLater(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                GUIView frame = new GUIView();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//            }
//        });

        ModelSubject modelSubject = new ModelSubject();
        Controller controller = new Controller(modelSubject);



    }
}
