package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader fileReader=new BufferedReader(new FileReader(args[0]));
        StringBuilder sb=new StringBuilder();
        while(fileReader.ready())
            sb.append(fileReader.readLine())
                    .append(" ");
        fileReader.close();
        String content=sb.toString();
        sb.setLength(0);
        for(String s:content.split(" +"))
            if(s.length()>6)
                sb.append(s).append(",");
        sb.setLength(sb.length()-1);
        content=sb.toString();
        BufferedWriter writer=new BufferedWriter(new FileWriter(args[1]));
        writer.write(content);
        writer.close();
    }
}
