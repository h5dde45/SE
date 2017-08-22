package ru.tk.collection.collarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("first");
        strings.add("second");

        for (String s:strings){
            System.out.println(s);
        }
        System.out.println(strings.get(1));


    }
}
