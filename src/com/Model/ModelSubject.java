package com.Model;

import com.JAVABean.Factory.DAOFactory;
import com.JAVABean.MapData.MapData;

import java.util.*;



/**
 * Created by Evilina on 2016/4/3.
 */
public class ModelSubject extends Observable
{

    private MapData mapData;
    private int id;

    public ModelSubject()
    {
    }

    public void setMapDataByID(int id) throws Exception
    {
    }

    public MapData getMapDataByID(int id) throws Exception
    {
        this.id = id;
        mapData = DAOFactory.getMapDataInstance().findByID(id);

        MapDataChanged();
        return mapData;
    }

    public List<MapData> getAllMapData() throws Exception {
        List<MapData> list = DAOFactory.getMapDataInstance().findAll("");

        return list;
    }


    public void MapDataChanged()
    {
        setChanged();
        notifyObservers(mapData);
    }
}
