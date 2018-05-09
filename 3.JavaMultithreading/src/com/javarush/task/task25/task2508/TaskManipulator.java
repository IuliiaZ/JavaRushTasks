package com.javarush.task.task25.task2508;

import java.io.IOException;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread thread;
    @Override
    public void run() {
        while (!thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){}
            }
    }

    @Override
    public void start(String threadName) {
        thread = new Thread(this, threadName);
        this.thread = thread;
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
