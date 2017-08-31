package ru.tk.string.t5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"ff", "FFF", "ffff", "FF", "f", "fff"};
        String[] strings2 = {"ff", "FFF", "ffff", "FF", "f", "fff"};
        System.out.println("=======before==========");

        for (String s : strings) {
            System.out.println(s);
        }
        Arrays.sort(strings);

        System.out.println("========after=========");

        for (String s : strings) {
            System.out.println(s);
        }

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, strings2);
        System.out.println("=======before==========");
        System.out.println(list);
        System.out.println("========after=========");
        Collections.sort(list);
        System.out.println(list);


    }
}
