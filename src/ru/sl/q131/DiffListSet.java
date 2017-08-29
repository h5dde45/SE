package ru.sl.q131;

import java.util.*;

public class DiffListSet {
    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();
        LinkedList<String>  list2=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add(null);

        for(String s:list) {
            System.out.println(list.indexOf(s)+" = "+s);
        }
        System.out.println("=============");
        list.add(3,"c");
        list.add(null);
        for(String s:list) {
            System.out.println(list.indexOf(s)+" = "+s);
        }
        System.out.println("=============");
        list.add(3,"e");

        for(String s:list) {
            System.out.println(list.indexOf(s)+" = "+s);
        }
        System.out.println("=============");

        list2.add("0");
        list2.add("1");
        list2.add("2");
        list2.add(null);
        list2.add(null);

        for(String s:list2) {
            System.out.println(list2.indexOf(s)+" = "+s);
        }
        System.out.println("=============");

        list2.add(1,"11");

        for(String s:list2) {
            System.out.println(list2.indexOf(s)+" = "+s);
        }
//        Set<String> set=new HashSet<>();
        Set<String> set=new LinkedHashSet<>();
        set.add("0");
        set.add("1");
        set.add(null);
        set.add("2");
        set.add(null);
        for(String s:set) {
            System.out.println(s);
        }
    }
}
