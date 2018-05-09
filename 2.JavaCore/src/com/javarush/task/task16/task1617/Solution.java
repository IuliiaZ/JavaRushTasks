package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        int n = countSeconds;
        try {
            Thread.sleep(3500);
            if (n>3.5) {
                clock.interrupt();
                System.out.println("Прервано!");
            }
        }catch (InterruptedException e){  }


    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int n = countSeconds;
            try {
                for (int i = countSeconds; i > 0; i--) {
                    System.out.print(countSeconds+" ");
                    countSeconds--;
                    Thread.sleep(1000);
                }
                System.out.println("Марш!");

            }catch (InterruptedException e){  }

            }
        }
    }
