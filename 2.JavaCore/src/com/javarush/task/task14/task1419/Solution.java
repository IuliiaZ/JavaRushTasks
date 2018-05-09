package com.javarush.task.task14.task1419;

import com.sun.glass.ui.CommonDialogs;

import javax.swing.plaf.basic.BasicButtonUI;
import javax.xml.ws.WebServiceException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.jar.JarException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] a = new int[1];
            a[0] = 1;
            a[2] = 2;
        }catch (Exception e){
            exceptions.add(e);
        }


        try{ String t = "C:\1.txt";
            File file = new File(t);

        } catch (Exception e){
            exceptions.add(e);
        }

        try{ throw new InstantiationException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new KeyException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new JarException();

        } catch (Exception e){
            exceptions.add(e);
        }

        try{ throw new NegativeArraySizeException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new ArrayStoreException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new IndexOutOfBoundsException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new IOException();

        } catch (Exception e){
            exceptions.add(e);
        }
        try{ throw new WebServiceException();

        } catch (Exception e){
            exceptions.add(e);
        }

    }
}
