package ru.tk.io.t8;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String s = "text 1";

//        char[] chars = new char[s.length()];
//        s.getChars(0, s.length(), chars, 0);

        try (FileWriter writer = new FileWriter("text2.txt")) {
//            for (char c : chars) {
//                writer.write(c);
//            }
            for (int i = 0; i < s.length(); i++) {
                writer.write(s.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
