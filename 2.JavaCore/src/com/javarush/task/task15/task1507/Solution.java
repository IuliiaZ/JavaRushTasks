package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(int m, int n, String value, String l) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(int m, int n, int a, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }
    public static void printMatrix(long m, int n, int a, String value) {
        System.out.println("Заполняем объектами String");

    }
    public static void printMatrix(long m, long n, int a, String value) {
        System.out.println("Заполняем объектами String");

    }
    public static void printMatrix(long m, long n, long a, String value) {
        System.out.println("Заполняем объектами String");

    }
    public static void printMatrix(long m, int n, long a, String value) {
        System.out.println("Заполняем объектами String");

    }
    public static void printMatrix(int m, long n, long a, String value) {
        System.out.println("Заполняем объектами String");

    }
    public static void printMatrix(int m, int n, long a, String value) {
        System.out.println("Заполняем объектами String");

    }
}