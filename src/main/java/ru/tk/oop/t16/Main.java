package ru.tk.oop.t16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();

        list.add(1);
        list.add(2);
        System.out.println(list);

        list.add(1,3);
        list.add(0,4);
        list.add(2,5);
        list.add(5,6);
        System.out.println(list);

        list2.addAll(list);
        list2.add(34);
        System.out.println(list2);
        list2.addAll(2,list);
        System.out.println(list2);
        System.out.println("========================");
        System.out.println("========================");

        list3.add(7);
        System.out.println(list3);
        list3.set(0,17);
        System.out.println(list3);
        System.out.println(list3.remove(0));
        System.out.println("========================");
        System.out.println("========================");

        LinkedList<String> list1=new LinkedList<>();
        String[] strings={"first","second","third"};

        Collections.addAll(list1,strings);
        System.out.println(list1);
        list1.addFirst("ff");
        list1.addLast("ll");
        System.out.println(list1.getFirst());
        System.out.println(list1.removeLast());
        System.out.println(list1.getLast());

    }
}
