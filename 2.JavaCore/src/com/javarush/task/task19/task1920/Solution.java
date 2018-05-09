package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        TreeMap<String, Double> list = new TreeMap<>();
        while ((line = reader.readLine()) != null){
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
        reader.close();
        double max = list.get(list.firstKey());
        for (Map.Entry<String, Double> pair : list.entrySet()){
            if (pair.getValue()>max){ max = pair.getValue(); }
        }
        for (Map.Entry<String, Double> pair : list.entrySet()){
            if (pair.getValue().equals(max)){
                System.out.println(pair.getKey());
            }
        }
    }
}
