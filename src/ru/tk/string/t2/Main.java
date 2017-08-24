package ru.tk.string.t2;

public class Main {
    public static void main(String[] args) {
        int a=99;
        System.out.println(Integer.toString(a));
        System.out.println(0x80000000);
        System.out.println(Integer.MIN_VALUE);

        int b= -353;
        System.out.println(String.valueOf(b));

        Integer integer=null;
        System.out.println(String.valueOf(integer));
//        System.out.println(integer.toString()); - NullPointerException
    }
}
