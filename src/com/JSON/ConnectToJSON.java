package com.JSON;

import com.MapData.MapData;
import net.sf.json.*;

import java.io.*;

/**
 * Created by Evilina on 2016/3/30.
 */
public class ConnectToJSON
{
    /*
    * 取出文件内容，填充对象
    */
    public MapData findMapData(String path)
    {
        MapData aMapData = new MapData();

        //获得json文件的内容
        String sets = ReadFile(path);

        //格式化成json对象
        JSONObject jo = JSONObject.fromObject(sets);

        //System.out.println("------------" jo);
        //String name = jo.getString("xuenian");
        //System.out.println(name);

        aMapData.setId(jo.getInt("id"));
        aMapData.setName(jo.getString("name"));
        aMapData.setStationTableID(jo.getInt("stationID"));

        return aMapData;
    }

    //设置属性，并保存
    public boolean setElect(String path, String sets)
    {
        try
        {
            writeFile(path, sets);
            return true;
        } catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    //读文件，返回字符串
    public String ReadFile(String path)
    {
        File file = new File(path);
        BufferedReader reader = null;
        String laststr = "";
        try
        {
            //System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            //一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null)
            {
                //显示行号
                System.out.println("line " + line + ": " + tempString);
                laststr = laststr + tempString;
                line++;
            }
            reader.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (reader != null)
            {
                try
                {
                    reader.close();
                } catch (IOException e1)
                {
                }
            }
        }
        return laststr;
    }

    //把json格式的字符串写到文件
    public void writeFile(String filePath, String sets) throws IOException
    {
        FileWriter fw = new FileWriter(filePath);
        PrintWriter out = new PrintWriter(fw);
        out.write(sets);
        out.println();
        fw.close();
        out.close();
    }
}
