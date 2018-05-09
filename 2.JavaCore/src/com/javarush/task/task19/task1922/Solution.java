package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }
//    Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
//    Закрыть потоки.
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            String[] lines = line.split(" ");
            int count = 0;
            for (int i=0; i<lines.length; i++){
                for (int j=0; j<words.size(); j++)
                if (lines[i].equals(words.get(j))){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(line);
            }
        }
        bufferedReader.close();
    }
}
