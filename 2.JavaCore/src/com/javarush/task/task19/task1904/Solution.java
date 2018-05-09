package com.javarush.task.task19.task1904;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        String n = "Иванов Иван Иванович 31 12 1950";
        PersonScannerAdapter scannerAdapter = new PersonScannerAdapter(new Scanner(n));
        System.out.println(scannerAdapter.read());
    }

    public static class PersonScannerAdapter  implements PersonScanner{
        private final Scanner fileScanner;
        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Scanner sc = fileScanner;
            String s = sc.nextLine();
            String[] stroka = s.split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(stroka[5]), Integer.parseInt(stroka[4])-1, Integer.parseInt(stroka[3]));
            Person p = new Person(stroka[1], stroka[2], stroka[0], calendar.getTime());
            return p;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
