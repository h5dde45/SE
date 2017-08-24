package ru.tk.nio.t4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        try {
            Path path= Paths.get("text.txt");
            Path destinationPath= Paths.get("text2.txt");

            Files.copy(path,destinationPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
