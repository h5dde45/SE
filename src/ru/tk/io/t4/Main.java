package ru.tk.io.t4;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text="New text";
        byte[]bytes=text.getBytes();

//        FileOutputStream stream=null;

        try(FileOutputStream stream=new FileOutputStream("text.txt")) {
//            stream=new FileOutputStream("text.txt");
            for (byte b:bytes){
                stream.write(b);
            }
        } catch (IOException e) {
            System.out.println("Output error");
        }
//        finally {
//            if (stream!=null){
//                try {
//                    stream.close();
//                } catch (IOException e) {
//                    System.out.println("Error of close text.txt");
//                }
//            }
//        }

    }
}
