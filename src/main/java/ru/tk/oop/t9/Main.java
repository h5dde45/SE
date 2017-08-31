package ru.tk.oop.t9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Class aClass = new Class("aaa", Enums.SECOND);

        System.out.println(Arrays.toString(Enums.values()));
        System.out.println(Enums.valueOf("SECOND"));

        Scanner scanner = new Scanner(System.in);
        System.out.print(" 0, 1, 2 >> ");
        int choice = scanner.nextInt();
        System.out.println();
        Enums enums = Enums.values()[choice];

        switch (enums) {
            case FIRST:
                System.out.println("0");
                break;
            case SECOND:
                System.out.println("1");
                break;
            case THIRD:
                System.out.println("2");
                break;
        }
        if(enums==aClass.getNumber()){
            System.out.println(enums.ordinal());
        }

        for (Enums enums1:Enums.values()){
            System.out.println(enums1);
        }

    }
}
