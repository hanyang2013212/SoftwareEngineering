package com.Factory;

import com.MapData.MapDataDAO;
import com.MapData.MapDataDAOProxy;

/**
 * Created by Evilina on 2016/4/1.
 */
public class DAOFactory {
    public static MapDataDAO getMapDataInstance()
    {
        return new MapDataDAOProxy();
    }
}
