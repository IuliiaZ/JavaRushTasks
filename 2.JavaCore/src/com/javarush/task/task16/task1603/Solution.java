package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread o1 = new SpecialThread();
        Thread t1 = new Thread(o1);
        list.add(t1);
        SpecialThread o2 = new SpecialThread();
        Thread t2 = new Thread(o2);
        list.add(t2);
        SpecialThread o3 = new SpecialThread();
        Thread t3 = new Thread(o3);
        list.add(t3);
        SpecialThread o4 = new SpecialThread();
        Thread t4 = new Thread(o4);
        list.add(t4);
        SpecialThread o5 = new SpecialThread();
        Thread t5 = new Thread(o5);
        list.add(t5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
