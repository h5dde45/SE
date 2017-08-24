package ru.tk.nio.t7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        try{
//            Path path= Paths.get("new_text.txt");
            Path path= Paths.get("text2.txt");
//            Path destinationPath= Paths.get("new_text.txt");
////            Files.copy(path,destinationPath);
//            Files.move(path,destinationPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(path.getFileName());
        System.out.println(path);
        System.out.println(Files.exists(path));


    }
}
