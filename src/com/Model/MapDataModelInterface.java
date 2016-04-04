package com.Model;

/**
 * Created by Evilina on 2016/4/3.
 */
public interface MapDataModelInterface
{
    public void setMapDataByID(int id);

    public int getMapDataByID();

    public void registerObserver();

    public void removeObserver();
}
