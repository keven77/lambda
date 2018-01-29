package com.cpb.app.Resource;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * @version V1.0
 * @Author pengbo
 * @Title:
 * @date 18:07 2017/10/25
 */
public class Map {

    public static void main(String[] args) {
        String strWithComma = "1,2,3";
        String[] strWC = strWithComma.split(",");
        HashMap<Object, Object> strMap = Maps.newHashMap();
        for(String str:strWC)
        {
            strMap.put(str,str);
        }
        System.out.print(strMap);
    }
}
