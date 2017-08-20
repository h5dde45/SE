package ru.tk.collection;

import java.util.Set;
import java.util.TreeSet;

public class Main {
  private static   Set<Integer> set=new TreeSet<>((o1, o2) -> 0);

    public static void main(String[] args) {
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}
