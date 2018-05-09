package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 2 numbers");

        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) throw new Exception();
        int b = Integer.parseInt(reader.readLine());
        if (b <= 0) throw new Exception();
        System.out.println(maxDivider(a, b));
    }
        public static int maxDivider(int a, int b){
            int min;
            if (a>b){min=b;}
            else min = a;
            int max=1;
            for (int i=min; i>0; i--){
                if (a%i==0 && b%i==0){
                    max = i;
                    break;
                }
            }
            return max;

    }
}
