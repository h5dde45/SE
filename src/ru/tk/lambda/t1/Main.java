package ru.tk.lambda.t1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Incrementer incrementer= x -> x+1;
        System.out.println(incrementer.increment(3));

        ArrayList<Integer> ints=new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        ints.forEach(System.out::println);

    }
}
