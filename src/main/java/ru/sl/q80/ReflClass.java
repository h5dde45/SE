package ru.sl.q80;

import java.lang.reflect.Field;

public class ReflClass {
    public static void main(String[] args) {
        final Class<?> cls=Test.class;

        Test test=new Test();
        try {
            Field field=cls.getDeclaredField("iPriv");
            field.setAccessible(true);
            System.out.println(field.getInt(test));
            field.setInt(test,444);
            System.out.println(field.getInt(test));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println();
    }

}
