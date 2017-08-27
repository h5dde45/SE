package ru.sl.q176_q180;

import java.util.Properties;

public class SyringDemo {
    public static void main(String[] args) {
        String s = "1234567890string12345string";
        System.out.println(s);
        System.out.println("======");
        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 14));
        System.out.println(s.indexOf("str"));
        System.out.println("=====");
        System.out.println(s.lastIndexOf("str"));
        System.out.println("=====");
        System.out.println();

        Properties p = System.getProperties();
        System.out.println(p);
        String[] strings = p.toString().split(",");
        for (String s1 : strings) {
            if (s1.contains("version") || s1.contains("os")) {
                System.out.println(s1.trim());
            }
        }
        int i=23;
        String s1= String.valueOf(23);
        System.out.println(s1);
        System.out.println(s1.charAt(1));
        System.out.println(s.contains("56"));
        System.out.println(s.contains("562"));
    }
}
