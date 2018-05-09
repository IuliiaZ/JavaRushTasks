package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        File file = new File(s);
        FileInputStream inputStream = new FileInputStream(file);
        ArrayList<Integer> list = new ArrayList<>();

        while (inputStream.available()>0){
            int n = inputStream.read();
            list.add(n);
        }
        inputStream.close();
        reader.close();
        int min = list.get(0);
        for (int i=1; i<list.size(); i++){
            if (min>list.get(i)){ min = list.get(i); }
        }
        System.out.println(min);
    }
}
