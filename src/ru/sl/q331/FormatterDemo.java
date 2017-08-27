package ru.sl.q331;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
    public static void main(String[] args) {
        Formatter f=new Formatter();
        f.format("%s$s%n%S","qwe ","asd","zxc");
        System.out.println(f+"\n==================\n");

         f=new Formatter();
        f.format("%x %o %n%1$#x, %2$#o",100021,100021);
        System.out.println(f+"\n==================\n");

        Calendar calendar=Calendar.getInstance();
        f=new Formatter();
        f.format(
//                Locale.ENGLISH,
                "%1$tr %n%1$tH=%1$tM%n" +
                "%tB %1$tb %1$tm",calendar);
        System.out.println(f);

    }
}
