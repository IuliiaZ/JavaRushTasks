package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread target;
    Thread slave;
    LoggingStateThread(Thread target) {
        this.target = target;
        slave = new Thread();
        slave.start();
    }

    @Override
    public void run() {
        if (target.getState().equals("NEW")){
            System.out.println("NEW");
        }
        if (target.getState().equals("RUNNABLE")){
            System.out.println("RUNNABLE");
        }
        if (target.getState().equals("WAITING")){
            System.out.println("WAIT");
        }
        if (target.getState().equals("BLOCKED")){
            System.out.println("BLOCKED");
        }
        if (target.getState().equals("TIME_WAITING")){
            System.out.println("TIME_WAITING");
        }
        if (target.getState().equals("TERMINATED")){
            System.out.println("TERMINATED");
            this.interrupt();
        }
    }
}
