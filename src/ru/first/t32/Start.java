package ru.first.t32;

import ru.first.t6.Car;

import java.util.*;

public class Start {
    public static void main(String[] args) {

        HashMap<String,Car> hashMap=new HashMap<>();

        hashMap.put("n31ew",new Car("Tttt"));
        hashMap.put("rnew",new Car("rT56ttt"));
        hashMap.put("hnew",new Car("gTt67utfttt"));
        hashMap.put("onew",new Car("hTttt"));

        iterateMap(hashMap);
        System.out.println("=================");

        TreeMap<String,Car> treeMap=new TreeMap<>();

        treeMap.put("n31ew",new Car("Tttt"));
        treeMap.put("rnew",new Car("rT56ttt"));
        treeMap.put("hnew",new Car("gTt67utfttt"));
        treeMap.put("onew",new Car("hTttt"));
        treeMap.put("hnew",new Car("ooo"));

        iterateMap(treeMap);
        System.out.println(treeMap.higherKey("onew"));
        System.out.println(treeMap.lowerEntry("onew"));
        System.out.println("=================");

        LinkedHashMap<String,Car> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put("n31ew",new Car("Tttt"));
        linkedHashMap.put("rnew",new Car("rT56ttt"));
        linkedHashMap.put("hnew",new Car("gTt67utfttt"));
        linkedHashMap.put("onew",new Car("hTttt"));
        linkedHashMap.put("hnew",new Car("ooo"));

        iterateMap(linkedHashMap);

    }

    private static void iterateMap(Map map){
        System.out.println();
        Iterator<Map.Entry<String,Car>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Car> carEntry=iterator.next();
            System.out.println(carEntry.getKey().hashCode()+" = "+
                    carEntry.getKey()+" = "+carEntry.getValue());
        }
    }

}
