package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int length = inputStream.available();
        int spaceCount = 0;
        String space = " ";
        byte[] spaceByte = space.getBytes();
        while (inputStream.available()>0){
            int i = inputStream.read();
            for (byte sp : spaceByte){
            if (i == (sp)){
                spaceCount++;
            }
            }
        }
        inputStream.close();
        double result = 1.0*spaceCount/length*100;
        System.out.printf("%.2f", result);
    }
}
