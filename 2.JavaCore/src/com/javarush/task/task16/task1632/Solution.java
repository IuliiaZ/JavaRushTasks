package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();
        T4 t4 = new T4();
        T5 t5 = new T5();
        threads.add(t1);
        threads.add(t2);
        threads.add(t3);
        threads.add(t4);
        threads.add(t5);
        }

    public static void main(String[] args) {
        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();
        threads.get(4).start();
    }
    public static class T5 extends Thread {
       @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            int sum = 0;
            try{
                while(!(s=reader.readLine()).equals("N")){
                    sum += Integer.parseInt(s);
                }
                reader.close();
            }catch (IOException e){}
           System.out.println(sum);
        }

        }


    public static class T4 extends Thread implements Message {
        volatile boolean keepGoing = true;
        @Override
        public void run() {
           while (keepGoing){
           }
        }
        public void showWarning(){
            keepGoing = false;
        }
    }

    public static class T3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
            }
        }
    }
    public static class T2 extends Thread {
        @Override
        public void run() {
           try {
               Thread.sleep(1000);
           }catch (InterruptedException e){
               System.out.println("InterruptedException");
           }
            }
        }

    public static class T1 extends Thread {
        @Override
        public void run() {
           while (true){
               int x = 1;

           }
        }
    }
}