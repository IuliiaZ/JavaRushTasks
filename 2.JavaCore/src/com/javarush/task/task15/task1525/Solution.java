package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static{
        String s;
        try{File file = new File(Statics.FILE_NAME);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((s = reader.readLine()) != null) {
                lines.add(s);
            }
        } catch (Exception e){
            System.out.println("File not found.");
        }

    }


    public static void main(String[] args) throws FileNotFoundException, IOException{


        System.out.println(lines);
    }
}
