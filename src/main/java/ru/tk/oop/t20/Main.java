package ru.tk.oop.t20;

public class Main {
    public static void main(String[] args) {
        Class aClass=new Class(){
            @Override
            protected void s() {
                System.out.println("++++++++");
            }
        };

        aClass.s();
        System.out.println(aClass.getClass());
        System.out.println(aClass.getClass().toString());
    }
}
