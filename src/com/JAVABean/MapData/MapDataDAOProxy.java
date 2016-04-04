package com.JAVABean.MapData;

import java.util.List;

/**
 * Created by Evilina on 2016/3/31.
 */
public class MapDataDAOProxy implements MapDataDAO
{
    private MapDataConnection con;
    private MapDataDAO dao = null;

    public MapDataDAOProxy()
    {
        this.con = new MapDataConnection();
        this.dao = new MapDataImpl(con.ReadFile());
    }

    @Override
    public boolean doCreate(MapData mapData) throws Exception
    {
        boolean flag = false;

        return flag;
    }

    @Override
    public boolean doDelete(int id) throws Exception
    {
        return false;
    }

    @Override
    public MapData findByID(int id) throws Exception
    {
        MapData mapData = dao.findByID(id);
        return mapData;
    }

    @Override
    public List<MapData> findAll(String keyWord) throws Exception
    {
        List<MapData> list= dao.findAll("All");

        return list;

    }

}
