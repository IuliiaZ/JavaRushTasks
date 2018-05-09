package com.javarush.task.task18.task1813;

import java.io.*;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    protected FileOutputStream component;

    public static String fileName = "C:/tmp/result.txt";
    public AmigoOutputStream(FileOutputStream component) throws FileNotFoundException {
        super(fileName);
        this.component = component;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        component.flush();
        write(("JavaRush © All rights reserved.").getBytes());
        component.close();
    }

    @Override
    public FileChannel getChannel() {
        return component.getChannel();
    }



    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
