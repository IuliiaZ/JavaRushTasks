package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        while (true) {
            String file = new BufferedReader(new InputStreamReader(System.in)).readLine();
            try {
                FileInputStream fis = new FileInputStream(file);
                fis.close();
            }
            catch (FileNotFoundException e) {
                System.out.println(file);
                break;
            }
        }
    }
}
