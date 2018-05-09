package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        String result;
        try{
            String[] s = string.split(" ");
            result = s[1]+" "+s[2]+" "+s[3]+" "+s[4];
        }catch (Exception e){
          throw new TooShortStringException();
        }

        return result;
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
