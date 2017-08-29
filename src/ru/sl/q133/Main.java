package ru.sl.q133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        String[]strings=new String[10];
        strings[0]="a";
        strings[2]=String.valueOf(2);
        strings[3]=null;

        int[]ints=new int[10];
        System.out.println(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(ints);

        ArrayList list=new ArrayList();
        list.add("a");
        list.add(1);
        list.add(new Date());
        System.out.println(list);

        ArrayList<String> list2=new ArrayList<>();
        list2.add("a");
        list2.add(String.valueOf(1));
        list2.add(String.valueOf(new Date()));
        System.out.println(list2);

        for (String s:strings){
            System.out.print(s+" ");
        }
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        int i=0;
        while (i<strings.length){
            System.out.print(strings[i++]+" ");
        }
        System.out.println();

        Iterator<String> iterator=list2.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            iterator.remove();
        }
        System.out.println();
        System.out.println(list2.size());
        System.out.println(strings.length);
        System.out.println(list.size());

    }
}
