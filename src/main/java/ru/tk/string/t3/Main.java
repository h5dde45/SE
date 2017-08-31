package ru.tk.string.t3;

import java.util.Locale;

public class Main {

    private static int n=4;
    private static String name="New String";

    public static void main(String[] args) {
        double d=1/3.;

        System.out.println(d);
        System.out.printf("d=%.2f %n",d);
        System.out.println(String.format(Locale.ENGLISH,"d=%.2f ",d));
        System.out.printf("d=%15.4f %n",d);

        int i=893;
        System.out.println(i);
        System.out.printf("%d %n",i);
        System.out.printf("%o %n",i);
        System.out.printf("%x %n",i);
        System.out.printf("%s %d  %n",name,n);



    }
}
