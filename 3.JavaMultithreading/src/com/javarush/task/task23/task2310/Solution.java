package com.javarush.task.task23.task2310;

/* 
Напряги извилины!
*/
public class Solution {
    private static String name;

    Solution(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    private static void sout() {
        new Solution("sout") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        Solution.sout();
    }
}
