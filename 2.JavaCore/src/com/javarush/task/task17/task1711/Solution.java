package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat df2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        if (args.length != 0){
            try{
            switch (args[0]){
                case "-c":
                    for (int i =1; i<args.length; i+=3){
                        Person p = null;
                        if (args[i+1].equals("м")) {
                            p = Person.createMale(args[i], df1.parse(args[i+2]));
                        } else if (args[i+1].equals("ж")) {
                            p = Person.createFemale(args[i], df1.parse(args[i+2]));
                        }
                        synchronized (allPeople){
                        allPeople.add(p);
                        System.out.println(allPeople.indexOf(p));
                    }}
                    break;
                case "-u":
                    synchronized (allPeople){
                    for (int i =1; i<args.length; i+=4){
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        p.setName(args[i+1]);
                        p.setSex(args[i+2].equals("м")? Sex.MALE : Sex.FEMALE);
                        p.setBirthDay(df1.parse(args[i+3]));
                    }}
                    break;
                case "-d":
                    synchronized (allPeople){
                    for (int i =1; i<args.length; i++){
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        p.setName(null);
                        p.setSex(null);
                        p.setBirthDay(null);
                    }}
                    break;
                case "-i":
                    synchronized (allPeople){
                    for (int i =1; i<args.length; i++){
                        Person p = allPeople.get(Integer.parseInt(args[i]));
                        String s = p.getSex().equals(Sex.MALE)? "м" : "ж";
                        System.out.println(p.getName()+" "+s+" "+df2.format(p.getBirthDay()));
                    }}
                    break;
            }
        } catch (ParseException e){}
    }
}}
