package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        FileInputStream inputStream1 = new FileInputStream(file1);
        byte[] buffer1 = new byte[inputStream1.available()];
        inputStream1.read(buffer1);

        FileInputStream inputStream = new FileInputStream(file2);
        FileOutputStream outputStream = new FileOutputStream(file1);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        outputStream.write(buffer);
        FileOutputStream outputStream1 = new FileOutputStream(file1, true);
        outputStream1.write(buffer1);
        inputStream1.close();
        outputStream1.close();
        inputStream.close();
        outputStream.close();
    }
}
