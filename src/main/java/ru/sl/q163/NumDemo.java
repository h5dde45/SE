package ru.sl.q163;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumDemo {
    public static void main(String[] args) {
        List<Number> list=new ArrayList<>();
        list.add((byte)22);
        list.add((short)29000);
        list.add(1_900000_000);
        list.add(2_900000_000L);
        list.add((float)3.22);
        list.add(new BigInteger("12345678901112131415"));
        list.add(new BigDecimal("2.1e309"));

        for (Number number:list){
            System.out.println(number);
        }

    }
}
