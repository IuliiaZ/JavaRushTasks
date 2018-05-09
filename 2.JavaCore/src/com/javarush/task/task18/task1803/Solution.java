package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        ArrayList<Integer> byteList = new ArrayList<>();
        Map<Integer, Integer> list = new HashMap<>();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available()>0){
            int i = inputStream.read();
            byteList.add(i);
        }
        inputStream.close();
        for (int i =0; i<byteList.size(); i++){
            list.put(byteList.get(i), Collections.frequency(byteList, byteList.get(i)));
        }
        int max = Collections.max(list.values());
        for (Map.Entry<Integer, Integer> pair : list.entrySet()){
            if (pair.getValue()==max){
                System.out.print(pair.getKey()+" ");
            }

        }
    }
}
