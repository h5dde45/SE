package ru.sl.q163;

import java.time.LocalDate;

class WithoutGeneric{
    Object object;

    public WithoutGeneric(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
    void showType(){
        System.out.println(object.getClass().getName());
    }
}


public class SimpleExempleWithoutGeneric {
    public static void main(String[] args) {

        WithoutGeneric i;
        WithoutGeneric s;
        WithoutGeneric d;

        i=new WithoutGeneric(23);
        s=new WithoutGeneric("asd");
        d=new WithoutGeneric(LocalDate.now());

        i.showType();
        int a= (int) i.getObject();
        System.out.println(a);

        s.showType();
        String s1= (String) s.getObject();
        System.out.println(s1);

        d.showType();
        LocalDate localDate= (LocalDate) d.getObject();
        System.out.println(localDate);


    }
}
