package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
//        1 Считать с консоли имя файла. Считать содержимое файла.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new FileReader(file));

        while (reader1.ready()){
            System.out.println(new StringBuilder(reader1.readLine()).reverse());
        }
        reader1.close();



//        2 Для каждой строки в файле:
//        2.1 переставить все символы в обратном порядке.
//        2.2 вывести на экран.
//        3 Закрыть потоки.
    }
}
