package ru.sl.q163;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Gener<T>{
    T t;

    public Gener(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    void showType(){
        System.out.println(t.getClass().getName());
    }
}

public class SimpleExample {
    public static void main(String[] args) {

        Gener<Integer> integerGener;
//        Gener<int> intGener;
        Gener<String> stringGener;
        Gener<LocalDate> dateGener;

        integerGener=new Gener<>(222);
//        integerGener=new Gener<Double>(222.);
        stringGener=new Gener<>("asd");
        dateGener=new Gener<>(LocalDate.now());
//        integerGener=stringGener;

        integerGener.showType();
        int i=integerGener.getT();
        System.out.println(i);

        stringGener.showType();
        String s=stringGener.getT();
        System.out.println(s);

        dateGener.showType();
        LocalDate ld=dateGener.getT();
        System.out.println(ld);

        Map<String,String> map=new HashMap<>();
        map.put("123","t1");
        map.put(String.valueOf(new Integer(23)),"t2");

    }
}
