package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String result=null;
        String[] s=null;
        if (string.indexOf("\t") == -1) throw new TooShortStringException();
        s = string.split("\t");
        if (s.length<3) throw new TooShortStringException();
        result = s[1];
        return result;
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
