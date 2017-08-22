package ru.tk.collection.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet=new TreeSet<>();

        int[]  ints={5,6,3,7,8,5,9,2,1,4,0};

        for (int i = 0; i < ints.length; i++) {
            sortedSet.add(ints[i]);
        }
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        SortedSet<Integer> sortedSet2=sortedSet.subSet(2,7);
        System.out.println(sortedSet2);
        System.out.println(sortedSet.subSet(3,6).last());
        System.out.println(sortedSet.subSet(3,6).first());

        System.out.println(sortedSet.headSet(3));
        System.out.println(sortedSet.tailSet(3));

        NavigableSet<Integer> navigableSet=new TreeSet<>();

        for (int i = 0; i < ints.length; i++) {
            navigableSet.add(ints[i]);
        }

        System.out.println(navigableSet.lower(7));
        System.out.println(navigableSet.higher(7));
        System.out.println(navigableSet.higher(9));
        System.out.println(navigableSet.floor(8));
        System.out.println(navigableSet.ceiling(7));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet);
        System.out.println(navigableSet.descendingSet());

        Iterator iterator=navigableSet.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        TreeSet<Integer> treeSet=new TreeSet<>();
        int[] ints1={0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < ints1.length; i++) {
            treeSet.add(ints1[i]);
        }
        System.out.println(treeSet);
        System.out.println(treeSet.size());

        for (int i = 0; i < ints1.length/2; i++) {
            treeSet.remove(ints1[i]);
        }

        System.out.println(treeSet);

        Set<Integer> lSet=new LinkedHashSet<>();
        Set<Integer> lSet2=new LinkedHashSet<>();
        Set<Integer> hSet=new HashSet<>();
        for (int i = 0; i < ints.length; i++) {
            lSet.add(ints[i]);
            lSet2.add(ints[i]);
        }
        int[]ints2={1,2,3,4,5,34,64,78,654,3333};
        for (int i = 0; i < ints2.length; i++) {
            hSet.add(ints2[i]);
        }

        System.out.println(lSet);
        Iterator iterator1=lSet.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        System.out.println(lSet.equals(lSet2));
        System.out.println(lSet.add(3));
        System.out.println(lSet.add(23));
        System.out.println(lSet);
        System.out.println(hSet);

    }
}
