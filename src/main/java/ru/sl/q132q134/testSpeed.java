package ru.sl.q132q134;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class testSpeed {

//    public static final int COUNT = 1000_000;
    public static final int COUNT = 5000_000;

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> lincedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();

        System.out.println("====" + COUNT + "=====");
        testFillList(arrList, "ArrayList");
        testFillList(lincedList, "LincedList");
        testFillList(vector, "Vector");
        System.out.println(arrList.size() + ", " + lincedList.size() + ", " + vector.size());
        System.out.println("--------------");

        System.out.println("===Get by index=" + COUNT / 2 + "=====");
        testGetByIndex(arrList, "ArrayList");
        testGetByIndex(lincedList, "LincedList");
        testGetByIndex(vector, "Vector");
        System.out.println(arrList.size() + ", " + lincedList.size() + ", " + vector.size());
        System.out.println("--------------");

        System.out.println("===List contains element=" + COUNT / 2 + "=====");
        testContains(arrList, "ArrayList");
        testContains(lincedList, "LincedList");
        testContains(vector, "Vector");
        System.out.println(arrList.size() + ", " + lincedList.size() + ", " + vector.size());
        System.out.println("--------------");

        System.out.println("===Add by index=" + COUNT / 2 + "=====");
        testAddByIndex(arrList, "ArrayList");
        testAddByIndex(lincedList, "LincedList");
        testAddByIndex(vector, "Vector");
        System.out.println(arrList.size() + ", " + lincedList.size() + ", " + vector.size());
        System.out.println("--------------");

        System.out.println("===Delete by index=" + COUNT / 2 + "=====");
        testDelByIndex(arrList, "ArrayList");
        testDelByIndex(lincedList, "LincedList");
        testDelByIndex(vector, "Vector");
        System.out.println(arrList.size() + ", " + lincedList.size() + ", " + vector.size());
        System.out.println("--------------");


    }


    private static void testFillList(List<Integer> list, String name) {
        long start = System.nanoTime();
        filList(list, COUNT);
        String s = String.format("%8.5f", (System.nanoTime() - start) / 1000_000_000.);
        System.out.println(name + " = " + s);
    }

    private static void filList(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }

    private static void testGetByIndex(List<Integer> list, String name) {
        long start = System.nanoTime();
        list.get(COUNT / 2);
        String s = String.format("%10.9f", (System.nanoTime() - start) / 1000_000_000.);
        System.out.println(name + " = " + s);
    }

    private static void testContains(List<Integer> list, String name) {
        long start = System.nanoTime();
        list.indexOf(COUNT / 2);
        String s = String.format("%10.9f", (System.nanoTime() - start) / 1000_000_000.);
        System.out.println(name + " = " + s);
    }


    private static void testAddByIndex(List<Integer> list, String name) {
        long start = System.nanoTime();
        list.add(COUNT / 2,100);
        String s = String.format("%10.9f", (System.nanoTime() - start) / 1000_000_000.);
        System.out.println(name + " = " + s);
    }

    private static void testDelByIndex(List<Integer> list, String name) {
        long start = System.nanoTime();
        list.remove(COUNT / 2);
        String s = String.format("%10.9f", (System.nanoTime() - start) / 1000_000_000.);
        System.out.println(name + " = " + s);
    }

}
