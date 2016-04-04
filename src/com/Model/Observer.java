package com.Model;

/**
 * Created by Evilina on 2016/4/4.
 */
public class Observer implements ObserverInterface
{
    private int id;
    private String name;
    private String[] station;
    private MapDataModelSubjectInterface mapDataModelSubjectInterface;

    public Observer(MapDataModelSubjectInterface mapDataModelSubjectInterface)
    {
        this.mapDataModelSubjectInterface = mapDataModelSubjectInterface;
        mapDataModelSubjectInterface.registerObserver(this);
    }

    @Override
    public void update(int id, String name, String[] station)
    {
        this.id = id;
        this.name = name;
        this.station = station;
        System.out.println(name);
    }
}
