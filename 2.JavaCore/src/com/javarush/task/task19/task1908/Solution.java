package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
        String line = null;
        Pattern p = Pattern.compile("^\\d+$");
        while ((line = fileReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words){
                Matcher m = p.matcher(word);
                if (m.matches()){
                    fileWriter.write(word+" ");
                }
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
