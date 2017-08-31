package ru.tk.io.t5;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = "New Message новый";
        byte[] ints = str.getBytes();

        try (FileOutputStream stream = new FileOutputStream("text.txt")) {
            for (byte b : ints) {
                stream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
