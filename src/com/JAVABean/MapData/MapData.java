package com.JAVABean.MapData;

/**
 * Created by Evilina on 2016/3/28.
 * Stroe the map data
 */
public class MapData {
    private int id;
    private String name;
    private String[] station;

    public MapData()
    {

    }
    public MapData(int id, String name, String[] station)
    {
        setId(id);
        setName(name);
        setStation(station);

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStation(String[] station)
    {
        this.station = station;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getStation() {
        return station;
    }

    @Override
    public String toString()
    {
        String stationName = "";
        for (int i = 0; i < station.length; i++)
        {
            stationName += station[i];
        }

        return id+" "+name+" "+stationName;
    }
}
