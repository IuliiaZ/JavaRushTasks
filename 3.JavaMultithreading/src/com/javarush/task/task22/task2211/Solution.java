package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String file1 = args[0];
        String file2 = args[1];
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        inputStream.close();
        Charset windows = Charset.forName("Windows-1251");
        Charset utf = Charset.forName("UTF-8");
        String stroka = new String(buffer, windows);
        buffer = stroka.getBytes(utf);
        outputStream.write(buffer);
        outputStream.close();

    }
}
