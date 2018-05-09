package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(fileName);
        while (inputStream.available()>0){
            int i = inputStream.read();
            list.add(i);
        }
        inputStream.close();
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i : list) {
            tree.add(i);
        }
        for (int i : tree){
            System.out.print(i+" ");
        }
    }
}
