package com.Model;

import com.JAVABean.MapData.MapData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Evilina on 2016/4/4.
 */
public class MapDataDisplay implements Observer
{
    Observable observable;

    public MapDataDisplay(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override

    public void update(Observable o, Object arg)
    {
        if (o instanceof ModelSubject)
        {
            ModelSubject modelSubject = (ModelSubject) o;

        }
        if (arg instanceof MapData)
        {
            MapData mapData = (MapData) arg;
            System.out.println(mapData);
        }

    }
}
