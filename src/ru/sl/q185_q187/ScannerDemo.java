package ru.sl.q185_q187;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double weight;
        int heiht;
//        double delta;
//        String action;

        System.out.println("name");
        name = scanner.nextLine();

        System.out.println("weight");
        weight = scanner.nextDouble();

        System.out.println("height");
        heiht = scanner.nextInt();

        System.out.println(name+", "+weight+", "+heiht);


    }
}
