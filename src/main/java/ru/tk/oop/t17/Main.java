package ru.tk.oop.t17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Text 1");
        hashMap.put(2,"Text 2");

        System.out.println(hashMap.get(2));
        System.out.println(hashMap);

        System.out.println(hashMap.replace(2,"new text"));
        System.out.println(hashMap);

        System.out.println(hashMap.remove(2));
        System.out.println(hashMap);

        System.out.println("=======================");
        System.out.println("=======================");

        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(1,"11");
        linkedHashMap.put(2,"22");
        linkedHashMap.put(3,"33");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.entrySet());

        for (Map.Entry<Integer,String> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }


        System.out.println("=======================");
        System.out.println("=======================");

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        int[] ints={4,7,6,3,6,8};
        String[] s={"eww", "tgtgrt", "dfvrd", "sxc", "cvb", "jgmg"};

        for (int i = 0; i < ints.length; i++) {
            treeMap.put(ints[i],s[i]);
        }
        System.out.println(treeMap);
        for (Map.Entry<Integer,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+", "+entry.getValue());
        }

        System.out.println(treeMap.headMap(5));
        System.out.println(treeMap.tailMap(5));
    }
}
