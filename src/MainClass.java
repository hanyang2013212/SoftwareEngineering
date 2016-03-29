/**
 * Created by Evilina on 2016/3/28.
 */

import com.MAP.*;
import net.sf.json.*;

import java.util.List;
import java.util.Map;


public class MainClass {
    public static void main(String[] args)
    {
        MapData mapData = new MapData(0, "1", 0);
        new ReadMap().BuildJson("1",mapData);
    }
}
