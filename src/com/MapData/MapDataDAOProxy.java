package com.MapData;

import java.util.List;

/**
 * Created by Evilina on 2016/3/31.
 */
public class MapDataDAOProxy implements MapDataDAO
{


    MapDataDAOProxy()
    {

    }

    @Override
    public boolean doCreate(MapData mapData) throws Exception
    {
        boolean flag = false;

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
        return null;
    }

    @Override
    public List<MapData> findAll(String keyWord) throws Exception
    {
        return null;
    }
}
