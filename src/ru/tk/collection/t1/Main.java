package ru.tk.collection.t1;

import java.util.Set;
import java.util.TreeSet;

public class Main {

  private static   TreeSet<Integer> set=new TreeSet<>((x, y) -> (x < y) ? -1 : ((x == y) ? 0 : 1));

    public static void main(String[] args) {
        for (int i = 10; i >0; i--) {
            set.add(i);
        }

        System.out.println(set);
        System.out.println(set.descendingSet());
        System.out.println(set.lower(3));
        System.out.println(set.higher(3));
        System.out.println(set.headSet(3));
        System.out.println(set.tailSet(3));
        System.out.println(getNextElement(4));
        System.out.println(getPrevElements(4));
    }

    public static Integer getNextElement(Integer elem){
       return set.higher(elem);
    }

    public static Set<Integer> getPrevElements(Integer elem){
       return set.subSet(set.first(),false,elem,true);
    }
}
