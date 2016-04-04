package com.Model;

import com.JAVABean.Factory.DAOFactory;
import com.JAVABean.MapData.MapData;

import java.util.*;



/**
 * Created by Evilina on 2016/4/3.
 */
public class ModelSubject implements MapDataModelSubjectInterface
{
    private ArrayList obserbers;
    private MapData mapData;
    private int id;

    public ModelSubject()
    {
        obserbers = new ArrayList();
    }

    @Override
    public void setMapDataByID(int id) throws Exception
    {
    }

    @Override
    public MapData getMapDataByID(int id) throws Exception
    {
        this.id = id;
        mapData = DAOFactory.getMapDataInstance().findByID(id);

        MapDataChanged();
        return mapData;
    }



    @Override
    public void registerObserver(ObserverInterface o)
    {
        obserbers.add(o);
    }

    @Override
    public void removeObserver(ObserverInterface o)
    {
        int i = obserbers.indexOf(o);
        if (i >= 0)
        {
            obserbers.remove(i);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (int i = 0; i < obserbers.size(); i++)
        {
            ObserverInterface ObserverInterface = (ObserverInterface) obserbers.get(i);
            ObserverInterface.update(mapData.getId(),mapData.getName(),mapData.getStation());
        }
    }

    public void MapDataChanged()
    {
        notifyObservers();
    }
}
