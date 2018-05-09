package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        String id = args[0]+" ";

        String s;
        while ((s = br.readLine()) != null ){
        if (s.startsWith(id)){
            System.out.println(s);}
        }
        br.close();
    }
}
