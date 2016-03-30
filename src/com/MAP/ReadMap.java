package com.MAP;

import net.sf.json.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evilina on 2016/3/28.
 */
public class ReadMap {
    /**
     * Read the relative json, to fill the instance of class MapData
     */

    public static String BuildJson(String name,Object object)
    {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(object);
        jsonObject.put(name, jsonArray);
        System.out.println(jsonArray);

//        构造Json数据
        System.out.println(jsonObject);
        return jsonObject.toString();

    }


    public void pareseJson(String jsonString)
    {
        JSONObject jsonObject = JSONObject.fromObject(jsonString);
        JSONArray jsonArray = jsonObject.getJSONArray("1");
        List<MapData> map = new ArrayList<MapData>();
        for (int i = 0; i < jsonArray.size(); i++)
        {
            MapData aMapData = new MapData();
            aMapData.setId(jsonArray.getJSONObject(i).getInt("id"));
            aMapData.setName(jsonArray.getJSONObject(i).getString("name"));
            aMapData.setStationTableID(jsonArray.getJSONObject(i).getInt("stationTableID"));

            map.add(aMapData);
        }

        for (int i = 0; i < map.size(); i++)
        {
            MapData map2 = map.get(i);
            System.out.println("map" +map2.toString() );
        }

    }
}
