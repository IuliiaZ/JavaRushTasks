package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        TreeSet<String> list = new TreeSet();
        while (!(s = reader.readLine()).equals("end")){
            list.add(s);
        }
        reader.close();
        String[] n = list.first().split(".part");
        String name = n[0];
        for (String l : list){
            FileInputStream inputStream = new FileInputStream(l);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            FileOutputStream outputStream = new FileOutputStream(name, true);
            outputStream.write(buffer);
            inputStream.close();
            outputStream.close();
        }
    }
}
