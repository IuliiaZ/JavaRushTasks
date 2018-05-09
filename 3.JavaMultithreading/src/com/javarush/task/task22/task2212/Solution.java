package com.javarush.task.task22.task2212;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Проверка номера телефона
*/
//1) если номер начинается с '+', то он содержит 12 цифр
//        2) если номер начинается с цифры или открывающей скобки, то он содержит 10 цифр
//        3) может содержать 0-2 знаков '-', которые не могут идти подряд
//        4) может содержать 1 пару скобок '(' и ')' , причем если она есть, то она расположена левее знаков '-'
//        5) скобки внутри содержат четко 3 цифры
//        6) номер не содержит букв
//        7) номер заканчивается на цифру
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.length() == 0) { return false; }
        boolean result = true;
        Pattern p = Pattern.compile("^(\\+\\d{2})?(\\()?\\d{3}(\\))?\\d{3}(\\-)?\\d{2}(\\-)?\\d{2}");
        Matcher m = p.matcher(telNumber);
        if (!m.matches()){ result = false; }
       //^(\+\d\d)?(\()?\d{3}(\))?\d{3}(\-)?\d{2}(\-)?\d{2}
        return result;
    }

    public static void main(String[] args) {

    }
}
