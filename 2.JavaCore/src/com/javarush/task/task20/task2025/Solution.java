package com.javarush.task.task20.task2025;

/* 
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = new long[(int)N];
        int count = 0;
        for (int i=0; i<N; i++){
            int length = String.valueOf(i).length();
            int sum = 0;
            for (int j=0; j<length; j++){
                sum += String.valueOf(i).charAt(length-j);
            }
            long result1 = (long)Math.pow(sum,length);
            if (result1 == (long)i){
                result[count]=result1;
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
