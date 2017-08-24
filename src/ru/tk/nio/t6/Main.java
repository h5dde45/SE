package ru.tk.nio.t6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        int content;

        try (InputStream inputStream = Files.newInputStream(Paths.get("text.txt"))) {
            do {
                content = inputStream.read();
                if (content != -1) {
                    System.out.print((char) content);
                }
            }while (content != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
