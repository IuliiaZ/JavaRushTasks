package com.javarush.task.task21.task2113;

import java.util.*;

public class Hippodrome {
    private static List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }
    public Hippodrome(List horses){
        this.horses = horses;
    }
    public static Hippodrome game;
    public void run() throws InterruptedException {
        for (int i=0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for (Horse h : horses){
            h.move();
        }
    }
    public void print(){
        for (Horse h : horses){
            h.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
        Horse winner = null;
        for (int i=0; i<horses.size()-1; i++){
            if (horses.get(i).getDistance()>horses.get(i+1).getDistance()){
                winner = horses.get(i);
            } else {
                winner = horses.get(i+1);
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is "+getWinner().getName()+"!");
    }


        public static void main(String[] args) throws InterruptedException {
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);
        List<Horse> h = new ArrayList<>();
        h.add(horse1);
        h.add(horse2);
        h.add(horse3);
        game = new Hippodrome(h);
        game.run();
        game.printWinner();

        }
    }

