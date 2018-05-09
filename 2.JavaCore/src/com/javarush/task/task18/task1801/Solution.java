package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        File file = new File(s);
        FileInputStream inputStream = new FileInputStream(file);
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.available()>0){
            int i = inputStream.read();
            list.add(i);
        }
        inputStream.close();
        int max = list.get(0);
        for (int i = 1; i<list.size(); i++){
            if (max<list.get(i)){ max = list.get(i); }
        }
        System.out.println(max);
        reader.close();
    }
}
