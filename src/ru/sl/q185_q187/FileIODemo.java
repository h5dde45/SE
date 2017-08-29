package ru.sl.q185_q187;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {

        String fPath = "text2.txt";
        String sPath = "result.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
             fis = new FileInputStream(fPath);
             fos = new FileOutputStream(sPath);

            int s;

            while ((s = fis.read()) != -1) {
                fos.write(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
