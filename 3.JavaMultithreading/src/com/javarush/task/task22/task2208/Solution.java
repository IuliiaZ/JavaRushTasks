package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> data = new LinkedHashMap<>();
        data.put("name", "Ivanov");
        data.put("country", "Ukraine");
        data.put("city", "Kiev");
        data.put("age", "10");
        System.out.println(getQuery(data));
    }
    public static String getQuery(Map<String, String> params) {
        //name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
        StringBuilder sb = new StringBuilder("");
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() != null && pair.getValue() != null) {
                if (sb.toString().equals("")){
                sb.append(pair.getKey());
                sb.append(" = '");
                sb.append(pair.getValue());
                sb.append("'");
            } else {
                sb.append(" and ");
                sb.append(pair.getKey());
                sb.append(" = '");
                sb.append(pair.getValue());
                sb.append("'");
            }}
        }


        return sb.toString();
    }
}
