package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws FileNotFoundException, IOException {
        args[0] = "D:\\8.txt";
        String file = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        String line = null;
        String name = null;
        String number = null;
        String numbers[] = null;
        Date bDate;

        while ((line = fileReader.readLine()) != null){
            name = line.replace("\\d+", "");
            name = name.trim();
            number = line.replace("[A-Za-zА-Яа-я-]", "");
            numbers = number.split(" ");
            int year = Integer.parseInt(numbers[2]);
            int mounth = Integer.parseInt(numbers[1])-1;
            int day = Integer.parseInt(numbers[0]);
            Calendar calendar = new GregorianCalendar(year, mounth, day);
            bDate = calendar.getTime();
            PEOPLE.add(new Person(name, bDate));
        }
        System.out.println(PEOPLE);



        fileReader.close();
    }
}
