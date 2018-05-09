package com.javarush.task.task17.task1710;

import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        try{
            if (args.length != 0){
                switch (args[0]){
                    case "-c":
                        create(args[1], args[2], args[3]);
                        break;
                    case "-u":
                        update(args[1], args[2], args[3], args[4]);
                        break;
                    case "-d":
                        break;
                    case "-i":
                        info(args[1]);
                        break;
                }
            }
        } catch (ParseException e){}
    }

    static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static void create(String name, String sex, String bd) throws ParseException{
        if (sex.equals("м")){
            Person p = Person.createMale(name, df.parse(bd));
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }
        if (sex.equals("ж")){
            Person p = Person.createFemale(name, df.parse(bd));
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }

    }
    static void update(String index, String name, String sex, String bd) throws ParseException{
        Person p = allPeople.get(Integer.parseInt(index));
        p.setName(name);
        p.setSex(sex.equals("м")? Sex.MALE : Sex.FEMALE);
        p.setBirthDay(df.parse(bd));
    }
    static void delete(String index){
        allPeople.get(Integer.parseInt(index)).setName(null);
        allPeople.get(Integer.parseInt(index)).setBirthDay(null);
        allPeople.get(Integer.parseInt(index)).setSex(null);
    }
    static void info(String index){
        Person i = allPeople.get(Integer.parseInt(index));
        SimpleDateFormat newDateFormate = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String s = i.getSex().equals(Sex.MALE)? "м" : "ж";
        System.out.println(i.getName()+" "+s+" "+newDateFormate.format(i.getBirthDay()));
    }
}
