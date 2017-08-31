package ru.sl.q199__q200;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {

        Student student=new Student("F1","iv iv",123,"asd");
        System.out.println(student);
        System.out.println();

        String file="demo.data";
        Serializator sz=new Serializator();
        boolean b=sz.serialization(student,file);
        System.out.println(b);

        Student.faculty="F2";
        System.out.println(student);

        Student rez=null;

        try {
            rez=sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(rez);


    }
}
