package ru.tk.io.t7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream inputStream = new FileInputStream("text.txt")) {
            File file = new File("src/newfolder");

            if (!file.exists()) {
                file.mkdir();
            }
            try (FileOutputStream outputStream = new FileOutputStream("src/newfolder/newfile.txt")) {
                byte[] bytes = new byte[inputStream.available()];
//                int length;
//                while ((length = inputStream.read(bytes)) != -1) {
//                    outputStream.write(bytes, 0, length);
//                }
                int length = inputStream.read(bytes);
                outputStream.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
