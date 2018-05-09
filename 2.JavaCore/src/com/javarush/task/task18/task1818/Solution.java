package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        reader.close();

        FileInputStream inputStream1 = new FileInputStream(file2);
        FileInputStream inputStream2 = new FileInputStream(file3);

        FileOutputStream outputStream = new FileOutputStream(file1);
        byte[] buffer = new byte[inputStream1.available()];
        while(inputStream1.available()>0){
            inputStream1.read(buffer);
            outputStream.write(buffer);
        }
        byte[] buffer2 = new byte[inputStream2.available()];
        while (inputStream2.available()>0){
            inputStream2.read(buffer2);
            outputStream.write(buffer2);
        }
        inputStream1.close();
        inputStream2.close();
        outputStream.close();
    }
}
