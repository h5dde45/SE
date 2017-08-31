package ru.sl.q128;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<>();
//        Map<String,Integer> map=new LinkedHashMap<>();
        Map<String,Integer> map=new TreeMap<>();

        map.put("Iv Iv",new Integer(23));
        map.put("Se Pe",37);
        map.put("New New",27);

        System.out.println(map);
        System.out.println(map.put("First F",87));
        System.out.println(map.put("New New",97));
        System.out.println(map);

        Set<Map.Entry<String,Integer>> set=map.entrySet();

        for (Map.Entry<String,Integer> entry: set){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
