package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader reader2 = new BufferedReader(new FileReader(file));
        String line;
        while ((line=reader2.readLine()) != null){
            String[] temp = line.split(" ");
            for (int i =0; i<temp.length; i++){
                if (temp[i].matches("\\d+")){
                    for (Map.Entry<Integer, String> pair : map.entrySet()){
                        if (temp[i].matches(pair.getKey().toString())){
                            temp[i] = pair.getValue();
                        }
                    }
                }
                System.out.println(temp[i]+" ");
            }
        }
        reader2.close();


    }
}
