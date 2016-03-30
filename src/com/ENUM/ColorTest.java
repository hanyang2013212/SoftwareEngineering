package com.ENUM;

/**
 * Created by Evilina on 2016/3/29.
 */
public enum ColorTest

{
    RED("r"),GREEN("g"),BLUE("b");

    private String abb;
    private ColorTest(String abb)
    {
        this.abb = abb;

    }

    public String getAbb()
    {
        return abb;
    }
}
