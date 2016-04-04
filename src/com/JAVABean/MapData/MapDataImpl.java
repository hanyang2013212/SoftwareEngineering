package com.JAVABean.MapData;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evilina on 2016/4/3.
 */
public class MapDataImpl implements MapDataDAO
{
    private String laststr;

    public MapDataImpl(String laststr)
    {
        this.laststr = laststr;
    }

    @Override
    public boolean doCreate(MapData mapData) throws Exception
    {
        return false;
    }

    @Override
    public boolean doDelete(int id) throws Exception
    {
        return false;
    }

    @Override
    public MapData findByID(int id) throws Exception
    {
        MapData mapData = new MapData();
        JSONObject jsonObject = JSONObject.fromObject(laststr);
        JSONArray jsonArray = jsonObject.getJSONArray("MapData");

        JSONObject jsonObject1 = jsonArray.getJSONObject(id);
        mapData.setId(jsonObject1.getInt("id"));
        mapData.setName(jsonObject1.getString("name"));
        JSONArray station = jsonObject1.getJSONArray("station");
        String[] stationName = new String[station.size()];
        for (int j = 0; j < station.size(); j++)
        {
            stationName[j] = station.getString(j);
        }
        mapData.setStation(stationName);

        return mapData;
    }

    @Override
    public List<MapData> findAll(String keyWord) throws Exception
    {
        JSONObject jsonObject = JSONObject.fromObject(laststr);
        JSONArray jsonArray = jsonObject.getJSONArray("MapData");
        List<MapData> map = new ArrayList<MapData>();
        for (int i = 0; i < jsonArray.size(); i++)
        {
            MapData aMapData = new MapData();
            aMapData.setId(jsonArray.getJSONObject(i).getInt("id"));
            aMapData.setName(jsonArray.getJSONObject(i).getString("name"));

//TBC
            JSONArray station = jsonArray.getJSONObject(i).getJSONArray("station");
            String[] stationName = new String[station.size()];
            for (int j = 0; j < station.size(); j++)
            {
                stationName[j] = station.getString(j);
            }
            aMapData.setStation(stationName);

            map.add(aMapData);
        }

        for (int i = 0; i < map.size(); i++)
        {
            MapData map2 = map.get(i);
            System.out.println("map:" +map2.toString() );
        }



        return map;
    }
}
