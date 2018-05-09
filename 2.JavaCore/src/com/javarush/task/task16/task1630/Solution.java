package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static{
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = reader.readLine();
            String file2 = reader.readLine();
            reader.close();
        }catch (IOException e){}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fullFileName;
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            String result = null;
            try {
                BufferedReader reader2 = new BufferedReader(new FileReader(fullFileName));
                String line = null;
                ArrayList<String> list = new ArrayList<>();
                while ((line = reader2.readLine()) != null){
                  list.add(line);
                }
                reader2.close();
                StringBuilder sb = new StringBuilder("");
                for (String words : list){
                    sb.append(words+" ");
                }
                sb.setLength(sb.length()-1);
                result = sb.toString();
                return result;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) { e.printStackTrace(); }
            return result;
        }

        @Override
        public void run() {

        }
    }
}
