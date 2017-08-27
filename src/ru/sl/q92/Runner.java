package ru.sl.q92;

import java.util.ArrayList;

class Student implements Cloneable {
    private int id = 1100;
    private String name;
    private int age;
    private ArrayList<Byte> list = new ArrayList<>();

    public ArrayList<Byte> getList() {
        return list;
    }

    @Override
    protected Student clone() {
        Student copy = null;

        try {
            copy = (Student) super.clone();
            copy.list= (ArrayList<Byte>) list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return copy;
    }
}

public class Runner {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println("============");

        Student studentC = student.clone();
        System.out.println(studentC);
        System.out.println("============");

        System.out.println(student.getList()==studentC.getList());
        System.out.println(student.getList().equals(studentC.getList()));

    }
}
