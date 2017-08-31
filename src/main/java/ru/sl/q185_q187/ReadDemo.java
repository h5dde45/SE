package ru.sl.q185_q187;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {

    public static void main(String[] args) {
        String fPath="text2.txt";
        int i;
        int count = 0;

        File f=new File(fPath);
        FileReader fr = null;

        try {
            fr=new FileReader(f);
            while ((i=fr.read())!=-1){
                System.out.print((char) i);
                count++;
                Thread.sleep(200);
            }
            System.out.println(count);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
