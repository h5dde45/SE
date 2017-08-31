package ru.tk.collection.t2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        for (int i = 5,ch='a'; i >0 ; i--,ch++) {
            map.put(i,String.valueOf((char) ch));
        }

        System.out.println(map);


        Map<Integer,String> mapLink=new LinkedHashMap<>(5,1,true);

        for (int i = 5,ch='a'; i >0 ; i--,ch++) {
            mapLink.put(i,String.valueOf((char) ch));
        }
        System.out.println(mapLink);
        System.out.println(map.get(3));
        System.out.println(map.get(5));
        System.out.println(map.get(1));

        System.out.println(mapLink);
        System.out.println("==================");
        System.out.println("==================");

        SimpleLPUCache s=new SimpleLPUCache(2);
        s.put(1,"first");
        s.put(2,"second");
        s.put(3,"third");

        s.get(2);
        s.put(9,"ninth");
        System.out.println(s);


    }
}
