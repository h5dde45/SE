package ru.tk.io.t3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path="src/backup";
        File dir=new File(path);

        if(!dir.exists()){
            System.out.println(dir.mkdir()?"Successfully":"failed");
        }else {
            System.out.println("Dir already exists");
        }

        if(dir.isDirectory()){
            String[] strings=dir.list();

            if(strings!=null){
                for (String s:strings){
                    System.out.println(s);
                }
                System.out.println("========================");
                for (String s:strings){
                    File file=new File(path+"/"+s);
                    System.out.println(file.isDirectory()?
                            (s+" - directory"):(s+" - file"));
                }

            }
        }
    }
}
