package ru.tk.io.t2;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String path="C:\\Users/н\\Desktop/sample.txt";
        File file=new File(path);

        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile()?"yes":"no");
        System.out.println(file.isHidden()?"yes":"no");
        System.out.println(((int) (file.getTotalSpace()/1e9))+"Gb");
        System.out.println(((int) (file.getFreeSpace()/1e9))+"Gb");

    }
}
