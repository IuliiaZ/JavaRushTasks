package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        FileOutputStream outputStreamNew = new FileOutputStream(file3);
        byte buffer2[] = new byte[(byte)Math.ceil(inputStream.available()/2)];
        byte buffer[] = new byte[(byte)(inputStream.available()-buffer2.length)];
        while (inputStream.available()>0){
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
            int count2 = inputStream.read(buffer2);
            outputStreamNew.write(buffer2, 0, count2);
        }

        inputStream.close();
        outputStream.close();
        outputStreamNew.close();

    }
}
