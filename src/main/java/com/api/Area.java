package com.api;

import java.util.HashMap;
import java.util.Map;

public class Area {
    private static Map<Integer, String> areaCode;

    public Area() {
        this.areaCode = new HashMap<Integer, String>();
    }

    static{
        areaCode.put(111123 , "종로구");
        areaCode.put(111121 , "중구");
        areaCode.put(111131 , "용산구");
        areaCode.put(111142 , "성동구");
        areaCode.put(111141 , "광진구");
        areaCode.put(111152 , "동대문구");
        areaCode.put(111151 , "중랑구");
        areaCode.put(111161 , "성북구");
        areaCode.put(111291 , "강북구");
        areaCode.put(111171 , "도봉구");
        areaCode.put(111311 , "노원구");
        areaCode.put(111181 , "은평구");
        areaCode.put(111191 , "서대문구");
        areaCode.put(111201 , "마포구");
        areaCode.put(111301 , "양천구");
        areaCode.put(111212 , "강서구");
        areaCode.put(111221 , "구로구");
        areaCode.put(111281 , "금천구");
        areaCode.put(111231 , "영등포구");
        areaCode.put(111241 , "동작구");
        areaCode.put(111251 , "관악구");
        areaCode.put(111262 , "서초구");
        areaCode.put(111261 , "강남구");
        areaCode.put(111273 , "송파구");
        areaCode.put(111274 , "강동구");
    }
}
