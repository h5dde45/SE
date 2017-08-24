package ru.tk.io.t6;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream stream = new FileInputStream("text.txt")) {
//            int x = stream.available();
//            for (int i = 0; i < x; i++) {
//                System.out.print((char) stream.read());
//            }
            int ch;
            while ((ch=stream.read())!=-1){
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
