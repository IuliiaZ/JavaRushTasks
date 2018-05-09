package com.javarush.task.task25.task2512;

import java.util.ArrayList;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        ArrayList<String> list = new ArrayList();

        if (e instanceof Exception){
            t.interrupt();
            Throwable throwable = e;
            while (e != null){
                list.add(0, throwable.getCause()+": "+throwable.getMessage());
            }
        }
        for (String s : list){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        new Solution().uncaughtException(Thread.currentThread(), new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
    }
}
