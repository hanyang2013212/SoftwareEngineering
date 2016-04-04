package com.Model;

import com.JAVABean.MapData.MapData;

import java.util.Map;


/**
 * Created by Evilina on 2016/4/3.
 */
public interface MapDataModelSubjectInterface
{
    public void setMapDataByID(int id) throws Exception;

    public MapData getMapDataByID(int id) throws Exception;

    public void registerObserver(ObserverInterface o);

    public void removeObserver(ObserverInterface o);

    public void notifyObservers();
}
