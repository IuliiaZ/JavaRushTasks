package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte[] buffer = new byte[inputStream.available()];
        try{
            inputStream.read(buffer);
            inputStream.close();
            String n = buffer.toString();
            String[] nn = n.split(" ");
            int[] result = new int[nn.length];
            for (int i=0; i<nn.length; i++){
                result[i] = (int)Math.round(Double.parseDouble(nn[i]));
                }
            StringBuilder sb = new StringBuilder("");
            for (int i : result){
                sb.append(i+" ");
            }
            byte[] buffer2 = sb.toString().getBytes();
            outputStream.write(buffer2);
            outputStream.close();
    } catch (NumberFormatException e){}
}}
