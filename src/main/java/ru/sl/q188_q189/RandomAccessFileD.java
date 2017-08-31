package ru.sl.q188_q189;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileD {
    public static void main(String[] args) {
        String path="ras.txt";

        try (
                RandomAccessFile fileR=new RandomAccessFile(path,"r");
                RandomAccessFile fileRW=new RandomAccessFile(path,"rw");
                RandomAccessFile fileRW1=new RandomAccessFile("ras1.txt","rw");
                ){
            String tmp="";
            while ((tmp=fileR.readLine())!=null){
                System.out.println(tmp);
            }
            System.out.println("-==================");

            fileR.seek(2);
            byte[]bytes=new byte[11];
            fileR.read(bytes);
            System.out.println(new String(bytes));
            System.out.println("=========");

            fileRW.seek(4);
            fileRW.write("99999".getBytes());

            fileRW1.seek(4);
            fileRW1.write("99999".getBytes());



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
