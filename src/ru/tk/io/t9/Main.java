package ru.tk.io.t9;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader=new FileReader("text2.txt")){
            int ch;
            while ((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
