package com.MAP;

import net.sf.json.*;
/**
 * Created by Evilina on 2016/3/28.
 */
public class ReadMap {
    /**
     * Read the relative json, to fill the instance of class MapData
     */

    public static String BuildJson(String name,Object object)
    {
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(object);
        jsonObject.put(name, jsonArray);
        System.out.println(jsonArray);

//        构造Json数据
        System.out.println(jsonObject);
        return jsonArray.toString();

    }
}
