package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String file = args[0];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line;
        TreeMap<String, Double> list = new TreeMap<>();
        while ((line = bufferedReader.readLine()) != null){
            String[] temp = line.split(" ");
            if (list.containsKey(temp[0])){
                for (Map.Entry<String, Double> pair : list.entrySet()){
                    if (pair.getKey().equals(temp[0])){
                        double d = pair.getValue();
                        pair.setValue(d+Double.parseDouble(temp[1]));
                    }
                }
            } else {
                list.put(temp[0], Double.parseDouble(temp[1]));
            }
        }
        bufferedReader.close();
        for (Map.Entry<String, Double> pair : list.entrySet()) {
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

    }
}
