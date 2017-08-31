package ru.sl.q126;

import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<String> set=new HashSet<>();
//        Set<String> set=new LinkedHashSet<>();
        TreeSet<String> set=new TreeSet<>();

        set.add("sw");
        set.add("asd");
        set.add("csd");

        System.out.println(set);
        System.out.println(set.add("asd"));
        System.out.println(set.contains("csd"));
        System.out.println(set.isEmpty());

        set.clear();

        System.out.println(set);
        System.out.println(set.isEmpty());

    }
}
