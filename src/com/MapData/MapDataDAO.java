package com.MapData;

import java.util.List;

/**
 * Created by Evilina on 2016/3/31.
 */
public interface MapDataDAO
{
    /**
     * @param mapData
     * @return
     * @throws Exception
     */
    public boolean doCreate(MapData mapData) throws Exception;

    /**
     *
     * @param  id
     * @return
     * @throws Exception
     */
    public boolean doDelete(int id) throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    public MapData findByID(int id) throws Exception;

    /**
     *
     * @param keyWord
     * @return
     * @throws Exception
     */
    public List<MapData> findAll(String keyWord)throws Exception;
}
