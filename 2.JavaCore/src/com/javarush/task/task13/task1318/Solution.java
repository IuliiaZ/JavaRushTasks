package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title = reader.readLine();
        InputStream inputStream = new FileInputStream(title);
        while (inputStream.available()>0) {
            int x = inputStream.read();
            System.out.print((char)x);
        }
        System.out.println("");
        inputStream.close();
        reader.close();
    }
}