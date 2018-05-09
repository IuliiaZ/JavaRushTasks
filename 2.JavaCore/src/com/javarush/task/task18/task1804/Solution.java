package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available()>0){
            int i = inputStream.read();
            list.add(i);
        }
        inputStream.close();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i=0; i<list.size(); i++){
            map.put(list.get(i), Collections.frequency(list, list.get(i)));
        }
        int min = Collections.min(map.values());
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (pair.getValue()==min){
                System.out.print(pair.getKey()+" ");
            }
        }
    }
}
