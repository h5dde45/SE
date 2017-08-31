package ru.sl.q185_q187;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArrDemo {
    public static void main(String[] args) {
        String[] strings={"one","two","3"};

        File fByte=new File("ras.data");
        File fSymb=new File("ras1.data");

        try (
                FileOutputStream fos=new FileOutputStream(fByte);
                FileWriter fw=new FileWriter(fSymb);
                ){
            for(String s:strings){
                fos.write(s.getBytes());
                fw.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
