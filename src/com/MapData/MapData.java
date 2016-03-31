package com.MapData;

/**
 * Created by Evilina on 2016/3/28.
 * Stroe the map data
 */
public class MapData {
    private int id;
    private String name;
    private int stationTableID;

    public MapData()
    {

    }
    public MapData(int id,String name,int stationTableID)
    {
        setId(id);
        setName(name);
        setStationTableID(stationTableID);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStationTableID(int stationTableID) {
        stationTableID = stationTableID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStationTableID() {
        return stationTableID;
    }

    @Override
    public String toString()
    {
        return id+" "+name+" "+ stationTableID;
    }
}
