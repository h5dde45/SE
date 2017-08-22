package ru.tk.oop.t2.p1;

import ru.tk.oop.t2.p2.Cl1;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cl1 cl1=new Cl1();
//        NewClass newClass=null;
//        NewClass newClass2=null;
        NewClass newClass=new NewClass("asd");
        NewClass newClass2=new NewClass("asd");
        System.out.println(Cl1.class);
        System.out.println(cl1.getClass());
        System.out.println(newClass.getClass());
        System.out.println(newClass.hashCode());
        System.out.println(newClass2.hashCode());
        System.out.println(newClass==newClass2);
        System.out.println(newClass.equals(newClass2));
        System.out.println(newClass.toString());

        NewClass newClass1=newClass;
        newClass1.setName("new");
        System.out.println(newClass.getName());
        newClass.setName("old");
        System.out.println(newClass.getName());

        newClass1=newClass.clone();
        newClass1.setName("new");
        System.out.println(newClass.getName());



    }

}
