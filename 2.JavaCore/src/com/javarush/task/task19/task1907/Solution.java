package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileReader fileReader = new FileReader(file);
        StringBuilder sb = new StringBuilder("");
        while (fileReader.ready()){
            int data = fileReader.read();
            sb.append((char)data);
        }
        String stroka = sb.toString();
        String words[] = stroka.split("\\W");
        int count = 0;
        for (String word : words){
            if (word.equals("world")){ count++; }
        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}
