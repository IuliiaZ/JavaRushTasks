package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        FileInputStream inputStream = new FileInputStream(args[0]);
        String letters = "QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm";
        byte[] alphabet = letters.getBytes();

        int count = 0;
        while (inputStream.available()>0){
            int ch = inputStream.read();
            for (int i=0; i<alphabet.length; i++){
                if (ch == (int)alphabet[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
        inputStream.close();


    }
}
