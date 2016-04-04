package com.JAVABean.Factory;

import com.JAVABean.MapData.MapDataDAO;
import com.JAVABean.MapData.MapDataDAOProxy;

/**
 * Created by Evilina on 2016/4/1.
 */
public class DAOFactory {
    public static MapDataDAO getMapDataInstance()
    {
        return new MapDataDAOProxy();
    }
}
